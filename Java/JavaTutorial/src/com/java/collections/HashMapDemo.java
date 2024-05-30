package com.java.collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> mapDays = new HashMap<>();
		
		// Adding key elements
		mapDays.put(1, "Monday");
		mapDays.put(2, "Tuesday");
		mapDays.put(3, "Thursday");
	
		// Add duplicate values
		mapDays.put(3, "Thursday");
		
		System.out.println(mapDays);		
	}
}
