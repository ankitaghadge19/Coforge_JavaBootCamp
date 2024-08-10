import java.util.*;
import java.io.*;
import java.util.Scanner;

class A
{
        protected int a;
        Scanner sc = new Scanner(System.in);

        public void set_A()
            {
                    System.out.println("Enter the Value of A=");
                    a = sc.nextInt();
    
            }

        public void disp_A()
            {
                    System.out.println("Value of A="+a);
            }
};

class B extends A
{
        protected int b;
        
        public void set_B()
            {
                System.out.println("Enter the Value of B=");
                b = sc.nextInt();
            }

    
        public void disp_B()
            {
                System.out.println("Value of B="+b);
            }
};

class C extends B
{
	protected int c, p;
		
	public void set_C()
		{
				System.out.println("Enter the Value of C=");
				c = sc.nextInt();;
		}
		
	public void disp_C()
		{
				System.out.println("Value of C="+c);
		}
	
	public void cal_product()
		{
			p=a*b*c;
			System.out.println("Product of "+ a +" * " + b + " * " + c + " = " + p);
		}
};

class multilevelInheritance{
    public static void main(String[] args){
        C obj = new C();
		obj.set_A();
		obj.set_B();
	    obj.set_C();
		obj.disp_A();
		obj.disp_B();
		obj.disp_C();
		obj.cal_product();
    }
}
