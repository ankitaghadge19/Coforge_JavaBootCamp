import java.util.*;

class FindMissingNo {

    int missingNumber(int n, int arr[]) {

        int expectedSum = (n*(n+1))/2;
        
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }     
        return expectedSum - actualSum;
    }
}

// GFG Q Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1