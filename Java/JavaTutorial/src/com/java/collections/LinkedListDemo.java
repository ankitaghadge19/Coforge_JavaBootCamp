package com.java.collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> EmpId = new LinkedList<>();
		EmpId.add(101);
		EmpId.add(102);
		EmpId.add(103);
		EmpId.add(104);
		EmpId.add(104);
		EmpId.add(105);
		
		EmpId.remove((Integer)105);
		EmpId.addFirst(100);
		EmpId.removeFirstOccurrence(104);
		System.out.println( EmpId.get(3));
		System.out.println(EmpId.getLast());
		
		System.out.println(EmpId);	
	}
}
