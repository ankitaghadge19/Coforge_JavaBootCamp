import java.util.*;

class Car{
    Car get(){
        System.out.println("Inside Car Class!");
        return this;    // return current instance of the object 
    }
}

class BMW extends Car{
    @Override
    BMW get(){
        System.out.println("Inside BMW Class!");
        return this;
    }
}

public class CovariantReturn {
    public static void main(String[] args){
        Car car = new Car();
        car.get();

        BMW bmw = new BMW();
        bmw.get();
    }
}