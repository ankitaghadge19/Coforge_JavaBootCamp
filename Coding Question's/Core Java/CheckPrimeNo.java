import java.util.*;

public class CheckPrimeNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(IsPrime(n)){
            System.out.println(n+" is a Prime Number!");
        }else{
            System.out.println(n+" is not a Prime Number!");
        }
    }

    public static Boolean IsPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }else if(n == 2){
            return false;
        }else{
            for(int i=2; i<n; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}