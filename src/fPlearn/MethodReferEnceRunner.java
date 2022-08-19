package fPlearn;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferEnceRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {

		List.of("Apple", "Cat", "Bat", "Ant").stream().map(s -> s.length())
				.forEach(s -> MethodReferEnceRunner.print(s));

		List.of("Apple", "Cat", "Bat", "Ant").stream().map(String::length).forEach(MethodReferEnceRunner::print);

		Predicate<? super Integer> Evenpredicate = CreateEvenPreditate();
		Predicate<? super Integer> Oddpredicate = CreateOddPerditate();
		Integer max = List.of(45, 64, 23, 21, 35, 89, 98).stream().filter(Evenpredicate)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);

		// Using method Refernce

		Integer max1 = List.of(45, 64, 23, 21, 35, 89, 98).stream().filter(MethodReferEnceRunner::EvenRunner)
				.max(Integer::compare).orElse(0);

		System.out.println(max);

		System.out.println(max1);
	}

	private static Predicate<? super Integer> CreateOddPerditate() {
		return n -> n % 2 == 1;
	}

	private static Predicate<? super Integer> CreateEvenPreditate() {
		return n -> n % 2 == 0;
	}

	public static boolean EvenRunner(Integer number) {
		return number % 2 == 0;

	}
}