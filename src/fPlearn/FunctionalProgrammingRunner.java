package fPlearn;
import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String>list=List.of("Apple","Bat","Cat","Dog");
		printWithFPWithFiltering(list);
	

	}

	private static void printBasic(List<String> list) {
		for(String string:list) {
			
				System.out.println(string);
			}
			//System.out.println(string);
		}
		
	private static void printBasicWithFiltering(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
				System.out.println(string);
			}
		}
			//System.out.println(string);
		}
		
	
	
	
	
	
	
	//private static void printWithFP(List<String> list) {
	private static void printWithFp(List<String> list) {
		list.stream().forEach(element-> System.out.println("element-"+element));
		
		//here we use lambda expression and also forEach is not consider as loop 
		//it is consider as a function  for taking action
		//
	}
	

	//here we filtering the elements with conditions
	//
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
			.filter(element->element.endsWith("at"))
		
		
			.forEach(element-> System.out.println("element-"+element));
		
		
	}
	
	
	
	
}
