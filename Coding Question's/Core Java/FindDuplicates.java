import java.util.*;

public class FindDuplicates{
    public static void main(String[] args) {
        int n;
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements in the array: ");
        n = sc.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        boolean result = findDuplicates(list, n);
        System.out.println(result);
    }

    public static boolean findDuplicates(List<Integer> list, int n){
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(set.contains(list.get(i))){
                return true;
            }
            set.add(list.get(i));
        }
        return false;
    }
}
