import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading initial number of elements in the list
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        // Reading the initial list of integers
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        // Reading the number of queries
        int q = sc.nextInt();
        
        // Processing each query
        for (int i = 0; i < q; i++) {
            String operation = sc.next();
            
            if (operation.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        
        // Printing the updated list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

// Problem Link: https://www.hackerrank.com/challenges/java-list/problem