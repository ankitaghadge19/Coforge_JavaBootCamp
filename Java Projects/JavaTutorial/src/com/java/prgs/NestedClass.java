package com.java.prgs;

class OuterClass {
	static int x = 10;
	int y = 20;
	private static int z = 30;
	
	static class NestedClass {
		void display() {
			System.out.println(x + "," + z);
		}
	}	
}

public class NestedClass {

	public static void main(String[] args) {
		OuterClass.NestedClass obj = new OuterClass.NestedClass();
		obj.display();
	}
}
