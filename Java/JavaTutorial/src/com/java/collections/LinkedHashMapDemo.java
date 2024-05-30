package com.java.collections;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> EmpData = new LinkedHashMap<>();
		EmpData.put(101, "Sam");
		EmpData.put(103, "Ruby");
		EmpData.put(102, "James");
		
		EmpData.putIfAbsent(104, "Bella");
		
        // Check if a key exists
		System.out.println(EmpData.containsKey(105));
		
		// Change the value associated with an existing key
		EmpData.put(101, "Hardin");
	
		System.out.println(EmpData);
	}
}
