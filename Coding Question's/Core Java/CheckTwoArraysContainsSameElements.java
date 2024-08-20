import java.util.*;

public class CheckTwoArraysContainsSameElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a1 = {1, 2, 3, 1, 2, 7};
        int[] a2 = {1, 2, 2, 3, 3};

        if(ContainsSameElements(a1, a2)){
            System.out.println("It contains same elements!");
        }else{
            System.out.println("It does not contains same elements!");   
        }
    }

    public static boolean ContainsSameElements(int[] a1, int[] a2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : a1){
            set1.add(num);
        }

        for(int num : a2){
            set2.add(num);
        }

        if(set1.size() != set2.size()){
            return false;
        }

        return set1.equals(set2);
    }
}