package Assignments;
import java.util.Scanner;

public class AreaCalculator {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			displayMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 -> calculateTriangleArea();
            case 2 -> calculateRectangleArea();
            case 3 -> {
            	System.out.println("Bye!");
            	return;
            }
            default -> System.out.println("Invalid Input!");
			}
			System.out.println("=====================================================");
		}
	}
	
	private static void displayMenu() {
		System.out.println("\t  MENU");
        System.out.println("\t1. Triangle");
        System.out.println("\t2. Rectangle");
        System.out.println("\t3. Exit");
        System.out.print("Choice : ");
	}
	
	private static void calculateTriangleArea() {
		System.out.print("\nEnter base of traingle: ");
		double base = sc.nextDouble();
		System.out.print("Enter height of traingle: ");
		double height = sc.nextDouble();
		double area = 0.5 * base * height;
		System.out.println("Area of traingle is: " + area);
	}
	
	private static void calculateRectangleArea() {
		System.out.print("\nEnter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("AREA OF RECTANGLE IS: " + area);
	}
}
