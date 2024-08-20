import java.util.*;

public class LargestNoInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        
        System.out.println("Enter total no of elements in array: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        int largest = FindLargestNo(list);
        System.out.println("Largest no is: " + largest);
    }

    public static int FindLargestNo(List<Integer> list){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            int num = list.get(i);
            if(num > largest){
                largest=num;
            }
        }
        return largest;
    }
}