import java.util.*;
import java.io.*;
import java.util.Scanner;

class cal {    
    public int add(int a,int b){      
        return a + b;      
    }      
    public float add(float a, int b, int c){      
        return a + b + c;      
    }      
};     

class functionOverloading{
    public static void main(String[] args){
        cal C = new cal();                                                     
        System.out.println(C.add(10, 20));      
        System.out.println(C.add(12.3f, 20, 23));  
    }
}
