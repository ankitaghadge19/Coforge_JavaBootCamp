package Programs;

import java.util.ArrayList;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// Using wrapper calss in collection
		ArrayList<Integer> intList = new ArrayList<>();
		
		// Auto-Boxing: int to Integer
		intList.add(5);
		intList.add(10);
		intList.add(15);
		
		//Auto-Unboxing: Integer to int
		int firstElement = intList.get(0);
		System.out.println("First element is " + firstElement);	
	}
}
