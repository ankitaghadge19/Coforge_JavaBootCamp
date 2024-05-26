package com.java.prgs;
import java.util.Scanner;

public class SwitchWithReturn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();
        String result = getResult(choice);
        System.out.println("Result: " + result);
    }

    public static String getResult(int choice) {
    	return switch (choice) {
        case 1 -> "Option 1 selected!";
        case 2, 3 -> "Option 2 or 3 selected!";
        default -> "Invalid choice!";
        };
    }

}
