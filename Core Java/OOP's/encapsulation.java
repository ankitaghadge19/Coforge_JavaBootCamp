// Program to calculate the area of a rectangle
import java.util.*;
import java.io.*;
import java.util.Scanner;

class Rectangle {
    // Variables required for area calculation
    int length;
    int breadth;

    // Constructor to initialize variables
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    } 

    // Function to calculate area
    public int getArea() {
      return length * breadth;
    }
};

public class encapsulation{
    public static void main(String[] args) {
        // Create object of Rectangle class
        Rectangle rect = new Rectangle(8, 6);

        // Call getArea() function
        System.out.println("Area = "+rect.getArea());
    }
}
