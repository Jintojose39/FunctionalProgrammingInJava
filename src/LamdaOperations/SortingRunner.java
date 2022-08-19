package LamdaOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortingRunner {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 5, 8, 9, 9, 9, 9, 7, 8, 6, 8, 1, 2, 10, 11, 13);

		numbers.stream().sorted().distinct().forEach(s -> System.out.println(s));

		List<String> names = Arrays.asList("Jinto", "Jobin", "Shiju", "Jobil", "Bibin");

		List<String> names1 = names.stream().sorted().filter(s -> s.startsWith("J")).map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(names1.get(0));
		System.out.println(names1.get(1));

		List.of(45, 87, 88, 46, 78, 80).stream().filter(s -> s % 2 == 1).forEach(s -> System.out.println(s));

		List.of(1, 2, 3, 5, 6, 8, 9, 97, 8, 9, 52, 8, 9, 6, 8, 9, 1, 2, 3, 12, 41, 14).stream().filter(s -> s > 50)
				.forEach(s -> System.out.println(s));
		
		System.out.println("To display the even numbers");
		List.of(2,3,4,5,8,6,10,46,15,12).stream().filter(s->s%2==0).forEach(s->System.out.println(s));
		
		
		System.out.println("To display the odd numbers");
		
		List<Integer>oddnumbers=List.of(4,8,9,7,6,8,9,12,35,67,8,9).stream().filter(s->!(s%2==0)).collect(Collectors.toList());
		
		System.out.println(oddnumbers);
		
		

	}

}
