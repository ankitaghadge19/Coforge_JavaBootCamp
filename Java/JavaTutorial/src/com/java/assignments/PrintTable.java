package com.java.assignments;
import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int n = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}

}
