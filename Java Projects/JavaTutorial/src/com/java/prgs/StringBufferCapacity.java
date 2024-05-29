package com.java.prgs;

public class StringBufferCapacity {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("Hey!");
		System.out.println(sb3.capacity());
		
		sb3.append(" How are you?");
		System.out.println(sb3.capacity());
		
		sb3.append(" How are you? Let's meet today!");
		System.out.println(sb3.capacity());
		
		StringBuffer sb4 = new StringBuffer("Hi!");
		sb4.insert(3, " Are you free today?");
		System.out.println(sb4);
		
		sb4.replace(16, 22, " tomorrow");
		System.out.println(sb4);
		
		StringBuilder sb5 = new StringBuilder("Hello");
		System.out.println("Current capacity: " + sb5.capacity());

		// Ensure the capacity for appending a large string
		sb5.ensureCapacity(100);
		System.out.println("New capacity is: " + sb5.capacity());
	}
}
