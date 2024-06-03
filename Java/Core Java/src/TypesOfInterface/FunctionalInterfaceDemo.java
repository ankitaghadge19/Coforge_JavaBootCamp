package TypesOfInterface;
import java.util.Scanner;

interface Calculate{
	int calculateArea(int x);

	default void calculatePerimeter(int side) {
		
		System.out.println("Perimeter of square is " + 4*side);
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side of square: ");
		int a = sc.nextInt();
		
		Calculate s = (int x) -> x*x;
		
		int area = s.calculateArea(a);
		
		System.out.println("Area of square is " + area);
		
		s.calculatePerimeter(a);
	}
}
