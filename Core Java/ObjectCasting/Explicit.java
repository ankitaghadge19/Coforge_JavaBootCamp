// Down Casting -> Not Safe

import java.util.*;

public class Explicit{

    public static void main(String[] args){
        Person person = new Person("Sam", "Pune", "India");

        Address address = person;   // address Obj is of Address Type
        // System.out.println("Name: " + address.getName());   // Not allowed: getName() is not in Address class

        Person personAgain = (Person) address;
        System.out.println("Name: " + personAgain.getName()); 
    }
}
