import java.util.*;

public class FindFactorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long n = sc.nextLong();

        System.out.println("Factorial of " + n + " is " + FindFactorial(n));
    }

    public static long FindFactorial(long n){
        if(n==1){
            return 1;
        }else{
            return n * FindFactorial(n-1);
        }
    }

}