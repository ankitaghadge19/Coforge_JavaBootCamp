package Assignments;
import java.util.Scanner;

public class FindLargestSmallestNo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Input the array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        bubbleSort(array);
        
        int smallest = array[0];
        int largest = array[size - 1];
        
        // Output the sorted array
        System.out.println("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
    
    // Sort the array using Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
