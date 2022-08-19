package LamdaOperations;

import java.util.ArrayList;


//here is the programm for learn lamda operations
public class LamdaRunner {

	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList();
	
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		numbers.add(16);
		
		numbers.forEach(n ->{System.out.println(n);});
		
	}

}
