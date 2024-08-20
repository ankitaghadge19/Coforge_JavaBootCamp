import java.util.*;

public class FibonacciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int[] result = FibonacciSeries(n);

        System.out.print("Fibonacci Series: " );
        for(int num : result){
            System.out.print(num + " ");
        }
    }

    public static int[] FibonacciSeries(int n){
        int[] series = new int[n];

        for(int i=0; i<n; i++){
            if(i==0){
                series[i]=0;
            }else if(i==1){
                series[i]=1;
            }else{
                series[i]=series[i-1]+series[i-2];
            }
        }
        return series;
    }
}