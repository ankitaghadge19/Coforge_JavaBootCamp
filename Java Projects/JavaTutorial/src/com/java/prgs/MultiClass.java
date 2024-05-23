package com.java.prgs;

class A{} 
class B{}
public class MultiClass {

	public static void main(String[] args) {
		System.out.println("Inside MultiClass!");
	}
}

// compiler creates .java file for each class eventhough main() method is only present in MultiClass class
// eg. A.java, B.java, MultiClass.java