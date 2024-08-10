import java.util.*;
import java.util.stream.Collectors;

public class Terminal {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bella");
        names.add("Edward");
        names.add("Jeckup");
        names.add("James");
        names.add("Ruby");
        names.add("James");
        names.add("Tessa");
        names.add("Hardin");
        names.add("Noah");
        names.add("Nick");
        names.add("Anna");

        // foreach()
        names.stream()
             .forEach(System.out::println);


        // reduce()
        Optional<String> Concat = names.stream()
                                       .reduce((s1, s2) -> s1 + "," + s2);
    
        System.out.println(Concat); 

        // anyMatch()
        Boolean AnyMatchWithA = names.stream()
                                        .anyMatch(name -> name.startsWith("A"));
        System.out.println(AnyMatchWithA);  

        // noneMatch()
        Boolean NoneMatchWithD = names.stream()
                                        .noneMatch(name -> name.startsWith("D"));
        System.out.println(NoneMatchWithD); 

        // allMatch()
        Boolean NamesLenGreaterThanThree = names.stream()
                                        .allMatch(name -> name.length() > 3);
        System.out.println(NamesLenGreaterThanThree); 

        // findAny() with filter()
        Optional<String> AnyNameStartWithJ = names.stream()
                                           .filter((name) -> name.startsWith("J"))
                                           .findAny();
        System.out.println(AnyNameStartWithJ.orElse("No name starts with J!"));

        // findFirst()
        Optional<String> FirstName = names.stream()
                                       .findFirst();
    
        System.out.println(FirstName); 


        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        // min()
        Optional<Integer> min = nums.stream()
                                   .min(Integer::compareTo);
        System.out.println("Min value: " + min.orElse(null));

        // max()
        Optional<Integer> max = nums.stream()
                                   .max(Integer::compareTo);
        System.out.println("Max value: " + max.orElse(null));
    }
}
 

// Optional is use to handle the possibility of a null result, avoiding NullPointerException by explicitly checking for the presence or absence of a value