package com.java.collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		System.out.println(data.isEmpty());
		
		// Adding elements in ArrayList
		data.add("A");
		data.add("B");
		data.add(null);
		data.add("B");
		data.add("C");
		
		// Removing particular element
		data.remove("B");
		
		// Remove at given index
		data.remove(0);
		System.out.println("Size of Data: "+data.size());
		
		// Print ArrayList
		System.out.println("ArrayList Data: ");
		for(int i=0; i<data.size(); i++) {
			String str = data.get(i);
			System.out.println(str);
		}
		
		// Create new ArrayList
		List<String> data1 = new ArrayList<>();
		data1.add("x");
		data1.add(null);
		
		// Add all the elements from an existing collection to the new ArrayList
		data1.addAll(data);
		
		// Modify the element at a given index
		data1.set(3, "D");
		
		System.out.println("ArrayList Data1: ");
		for(int i=0; i<data1.size(); i++) {
			String str = data1.get(i);
			System.out.println(str);
		}
		
		// Find the index of the first occurrence of an element
		System.out.println("First occurrence of null: "+data1.indexOf(null));
		
		// Find the index of the last occurrence of an element
		System.out.println("Last occurrence of null: "+data1.lastIndexOf(null));
		
		// Remove all the elements exist in a given collection
		data1.clear();
		System.out.println("Size of Data1: "+data1.size());
		
	}
}
