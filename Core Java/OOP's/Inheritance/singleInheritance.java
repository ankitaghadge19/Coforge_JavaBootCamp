import java.util.*;
import java.io.*;
import java.util.Scanner;

class A
{

	    protected int a;
        Scanner sc = new Scanner(System.in);
	
		public void set_A()
		{
			System.out.println("Enter the Value of A: ");
			a = sc.nextInt();
			
		}
		public void disp_A()
		{
			System.out.println("Value of A: "+a);
		}
};


class B extends A
{
	protected int b,p;
    Scanner sc = new Scanner(System.in);
	
	public void set_B()
		{
			set_A();
			System.out.println("Enter the Value of B: ");
			b = sc.nextInt();
		}
		
	public void disp_B()
		{
			disp_A();
			System.out.println("Value of B: "+b);
		}
		
		void cal_product()
		{
			p=a*b;
			System.out.println("Product of "+a+" * "+b+" = "+p);
		}		
};


class singleInheritance{
    public static void main(String[] args){
        B obj = new B();
        obj.set_B();
        obj.cal_product();	
    }
}
