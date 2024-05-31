package Programs;
import java.util.Scanner;

//Interface for Length
interface Length {
 void setLength();
 int getLength();
}

//Interface for Breadth
interface Breadth {
 void setBreadth();
 int getBreadth();
}

//Class that implements both Length and Breadth interfaces
class Calculate implements Length, Breadth {
 private int length;
 private int breadth;

 @Override
 public void setLength() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter value of length: ");
     this.length = sc.nextInt();
 }

 @Override
 public int getLength() {
     return this.length;
 }

 @Override
 public void setBreadth() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter value of breadth: ");
     this.breadth = sc.nextInt();
 }

 @Override
 public int getBreadth() {
     return this.breadth;
 }

 // Method to calculate the area
 public void calculateArea() {
     int area = getLength() * getBreadth();
     System.out.println("Area = " + area);
 }
}

public class InterfaceWithMultipleInheritance {

	public static void main(String[] args) {
		Calculate obj = new Calculate();
        obj.setLength();
        obj.setBreadth();
        obj.calculateArea();
	}
}
