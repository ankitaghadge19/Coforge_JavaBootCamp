import java.util.*;

public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(Reverse(str));
    }

    public static String Reverse(String str){
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i=chars.length-1; i>=0; i--){
            result.append(chars[i]);
        }
        return result.toString();
    }
}