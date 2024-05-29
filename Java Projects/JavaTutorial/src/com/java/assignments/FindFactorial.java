package com.java.assignments;
import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			result = result*i;
		}
		System.out.println("Factorial of " + num + " is " + result);

	}

}
