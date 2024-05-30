package com.java.prgs;

public class NewForLoop {

	public static void main(String[] args) {
		String[] names = { "a", "b", "c"};
		for(String s: names) {
			System.out.println(s);
		}
		
		int[] num = {1, 2, 3};
		for(int i: num) {
			System.out.println(i);
		}
	}
}
