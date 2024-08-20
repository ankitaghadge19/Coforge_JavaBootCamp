import java.util.*;

public class CheckPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        if(CheckPalindrome(str)){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not Palindrome!");
        }
    }

    public static Boolean CheckPalindrome(String str){
        int len = str.length();
        for(int i = 0; i<len-1; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}