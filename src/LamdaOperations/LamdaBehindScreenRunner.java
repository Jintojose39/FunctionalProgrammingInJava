package LamdaOperations;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvennumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number % 2 == 0;
	}
}

public class LamdaBehindScreenRunner {

	public static void main(String[] args) {

		List.of(12, 23, 45, 45, 67).stream().filter(s -> s % 2 == 0)
		.forEach(s -> System.out.println(s));

		List.of(12, 23, 45, 45, 67).stream().filter(new EvennumberPredicate())
		.forEach(s -> System.out.println(s));
		
		

		// Stream<T> filter(Predicate<? super T> predicate);
		// void forEach(Consumer<? super T> action);
	}

}
