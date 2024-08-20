import java.util.*;

public class FindZeroSumPairs{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of elements in the array: ");
        n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        findZeroSumPairs(array);
    }

    public static void findZeroSumPairs(int[] array){
        Set<Integer> set = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for(int num : array){
            if(set.contains(-num)){
                result.add(new int[] {num, -num});
            }
            else{
                set.add(num);
            }
        }

        if(result.isEmpty()){
            System.out.println("No pairs found!");
        }else{
            System.out.println("Pairs with zero sum: ");
            for(int[] pair: result){
                System.out.println(pair[0] + " " + pair[1]);
            }
        }
    }
}