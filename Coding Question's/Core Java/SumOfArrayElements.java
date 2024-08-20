import java.util.*;

public class SumOfArrayElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total no of elements in array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for(int num : array){
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}