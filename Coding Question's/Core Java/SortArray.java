import java.util.*;

public class SortArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total no of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.print("Sorted Array: ");
        for(int num: array){
            System.out.print(num + " ");
        }
    }
}