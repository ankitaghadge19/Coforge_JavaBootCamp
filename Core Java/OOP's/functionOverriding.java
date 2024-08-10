import java.util.*;
import java.io.*;
import java.util.Scanner;

class Base {
    public void print() {
        System.out.println("Base Function");
    }
}

class Derived extends Base {
    @Override
    public void print() {
        System.out.println("Derived Function");
        // super.print();
    }
}

public class functionOverriding {
    public static void main(String[] args) {
        Derived derived1 = new Derived();
        derived1.print();
    }
}

/* Output:
   Derived Function

Here, the same function print() is defined in both Base and Derived classes.
So, when we call print() from the Derived object derived1, 
the print() from Derived is executed by overriding the function in Base */

