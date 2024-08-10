import java.util.*;

public class Initializer{

    // Static Variable
    private static int staticNum;

    // Instance Variable
    private int instanceNum;

    // Static Initializer Block
    static {
        staticNum = 10;
        System.out.println("Inside Static Initializer Block!");
    }

    // Instance Initializer Block
    {
        instanceNum = 20;
        System.out.println("Inside Instance Initializer Block!");
    }

    // Constructor
    Initializer(){
        System.out.println("Inside Constructor!");
    }

    public static void main(String[] args){
        Initializer obj1 = new Initializer();
        Initializer obj2 = new Initializer();
    }
}