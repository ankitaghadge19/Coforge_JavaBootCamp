// Up Casting -> Safe

import java.util.*;

public class Implicit{

    public static void main(String[] args){
        Person person = new Person("Sam", "Pune", "India");

        Address address = person;

        // System.out.println("Name: " + address.getName());   // Not allowed: getName() is not in Address class

        System.out.println("City: " + address.getCiy());
        System.out.println("Country: " + address.getCountry());
    }
}

