package com.java.prgs;

public class Label {

	public static void main(String[] args) {
		x_lbl:
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(i%2 == 0) {
					continue x_lbl;
				}
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}
