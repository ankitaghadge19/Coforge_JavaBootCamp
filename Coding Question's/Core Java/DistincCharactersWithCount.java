import java.util.*;

public class DistincCharactersWithCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        Map<Character, Integer> charsCount = new HashMap<>();

        for(char c : chars){
            if(charsCount.containsKey(c)){
                charsCount.put(c, charsCount.get(c)+1);
            }else{
                charsCount.put(c, 1);
            }
        } 
        System.out.println(charsCount);
    }
}