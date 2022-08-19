package fPlearn;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FpNumberRunner {

	public static void main(String[] args) {

		// List<Integer>numbers=List.of(4,6,8,13,3,15);

		List.of("Apple", "Ant", "Bat").stream().map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));

		List.of("Apple", "Ant", "Bat").stream().map(s -> s.length()).forEach(s -> System.out.println(s));

		IntStream.range(1, 20).forEach(s -> System.out.println(s));

		IntStream.range(1, 11).map(s -> s * s).forEach(s -> System.out.println(s));
		
		
		System.out.println("The squre of numbers between 1- 10 are");
		
		IntStream.range(1, 11).map(s -> s * s).boxed().collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		
		

	}

}
