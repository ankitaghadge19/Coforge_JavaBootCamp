import java.util.*;
import java.io.*;
import java.util.Scanner;

/*
class A
{
 	protected int x;
 	public void getx()
    {
 	    System.out.println("enter value of x: ");
        x = sc.nextInt();
    }
};
class B
{
 	protected int y;
 	public void gety()
 	{
 	    System.out.println("enter value of y: "); 
        y = sc.nextInt();
 	}
};

interface InterfaceA {
    void getx();
}

interface InterfaceB {
    void gety();
}

class C extends A, B   
{
 	public void sum()
 	{
 	    System.out.println("Sum = "+(x + y));
 	}
};


class singleInheritance{
    public static void main(String[] args){
        C obj = new C(); 
        obj.getx();
        obj.gety();
        obj.sum();
    }
}
=>The error you are encountering is because Java doesn't support multiple inheritance of classes, 
    which means you cannot directly extend more than one class in Java.
    To achieve multiple inheritance of behavior, you should use interfaces or composition instead.
*/

// Using interface

interface A {
    void getx();
}

interface B {
    void gety();
}

class C implements A, B {
    private int x;
    private int y;

    @Override
    public void getx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        x = sc.nextInt();
    }

    @Override
    public void gety() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of y: ");
        y = sc.nextInt();
    }

    public void sum() {
        getx(); // You can call methods from the interfaces directly
        gety();
        System.out.println("Sum = " + (x + y));
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.sum();
    }
}
