package com.java.collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> daysOfWeek = new HashSet<>();
		
		//Add elements
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        
        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
		
        // Iterating using forEach method with lambda expression
        System.out.println("Iterating using forEach method:");
        daysOfWeek.forEach(day -> System.out.println(day)); 
	}
}
