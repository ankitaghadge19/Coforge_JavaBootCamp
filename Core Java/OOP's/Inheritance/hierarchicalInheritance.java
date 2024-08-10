import java.util.*;
import java.io.*;
import java.util.Scanner;

class sides
{
        protected int h, b;
        Scanner sc = new Scanner(System.in);

        public void set_sides(String shape)
        {
                System.out.println("Enter the height of "+shape+": ");
                h = sc.nextInt();
                System.out.println("Enter the base of "+shape+": ");
                b = sc.nextInt();

        }
};

class triangle extends sides
{
		protected double area;
        Scanner sc = new Scanner(System.in);
			
		public void cal_area()
        {
            set_sides("Triangle");
            area=0.5*h*b;
        }

        void print_area()
        {
            System.out.println("Area of Triangle is "+area);
        }
};

class parallelogram extends sides
{
		protected double area;
			
		public void cal_area()
        {
            set_sides("Parallelogram");
            area=h*b;
        }

        void print_area()
        {
            System.out.println("Area of Parallelogram is "+area);
        }
};

class hierarchicalInheritance{
    public static void main(String[] args){
        triangle t = new triangle();
        t.cal_area();
        t.print_area();

        parallelogram p = new parallelogram();
        p.cal_area();
        p.print_area();
    }
}
