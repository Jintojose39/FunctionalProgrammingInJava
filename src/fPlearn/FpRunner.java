package fPlearn;

import java.util.List;

public class FpRunner {

	public static void main(String[] args) {
		
		
		List<Integer>numbers=List.of(4,5,6,8,3,9,78,95,8,9);
		
		numbers.stream().forEach(element->System.out.println(element));
		
		
		int sum =numbers.stream().reduce(0 ,(number1,number2)->number1+number2);
		
		
		
		
	}
}
