import java.util.*;

public class FindSecLargestElemsUsingCollection {
    public int print2largest(int[] arr) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : arr){
            set.add(num);
        }
        
        List<Integer> list = new ArrayList<>(set);
        list.sort(null);
        
        // System.out.println(list);
        
        int n = list.size();     
        if(n<2){
            return -1;
        }  
        return(list.get(n-2));
    }
}

// GFG Q Link: https://www.geeksforgeeks.org/problems/second-largest3735/1
