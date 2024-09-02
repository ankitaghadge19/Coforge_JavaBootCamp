import java.util.*;

public class TopKFrequentElems {
    public int[] topK(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            int count = map.getOrDefault(num, 0);
            
            map.put(num, count+1);
        };
        
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     System.out.println(entry.getKey() + "->" + entry.getValue());
        // }
        
        PriorityQueue <Map.Entry<Integer, Integer>> pq = 
        new PriorityQueue <>((a, b) -> {
            if(b.getValue().equals(a.getValue())){
                return b.getKey() - a.getKey();
            }
            
            return b.getValue() - a.getValue();
        }) ;
        
        pq.addAll(map.entrySet());
        
        // To print pq
        // while(!pq.isEmpty()){
        //     Map<Integer, Integer> entry = pq.poll();
        //     System.out.println(entry.getKey() + "->" + entry.getValue());
        // }
        
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = pq.poll().getKey();
        }
        return result;
    }
}

// GFG Q Link: https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1
