import java.util.*;
import java.io.*;
import java.util.Scanner;

class implementAbstraction{
    private	int a, b;

	// method to set values of private members
	public void set(int x, int y)
	{
		a = x;
		b = y;
	}

	public void display()
	{
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
};

class abstraction{
    public static void main(String[] args){
        implementAbstraction obj = new implementAbstraction();
        obj.set(10, 20);
        obj.display();	
    }
}

/* You can see in the above program we are not allowed to access the variables a and b directly, 
however, one can call the function set() to set the values in a and b and the function display() 
to display the values of a and b */ 


