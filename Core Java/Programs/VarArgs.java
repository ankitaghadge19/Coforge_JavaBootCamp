import java.util.*;

public class VarArgs{
    public static void main(String[] args){

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
    }

    public static int add(int ...nums){
        int result = 0;
        for(int num : nums){
            result += num;
        }
        return result;
    }
}