import java.util.*;
import java.util.stream.Collectors;

public class NonTerminal {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bella");
        names.add("Edward Cullen");
        names.add("Jeckup");
        names.add("James");
        names.add("Ruby Bell");
        names.add("James");
        names.add("Tessa");
        names.add("Hardin");
        names.add("Noah");
        names.add("Nick");
        names.add("Anna");

        // filter()
        List<String> NameStartWithA = names.stream()
                                           .filter((name) -> name.startsWith("A"))
                                           .collect(Collectors.toList());
        System.out.println(NameStartWithA);


        // map()
        List<Integer> LenghtOfEachName = names.stream()
                                              .map(String::length)
                                              .collect(Collectors.toList());
        System.out.println(LenghtOfEachName); 

        // flatMap()
        List<String> FlattenNames = names.stream()
                                         .flatMap(name -> Arrays.stream(name.split(" ")))
                                         .collect(Collectors.toList());
        System.out.println(FlattenNames);

        // distinct()
        List<String> UniqueNames = names.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println(UniqueNames);    

        // sorted()
        List<String> SortNames = names.stream()
                                      .sorted()
                                      .collect(Collectors.toList());
        System.out.println(SortNames);

        // limit()
        List<String> FirstThreeNames = names.stream()
                                            .limit(3)
                                            .collect(Collectors.toList());
        System.out.println(FirstThreeNames);      

        // skip()
        List<String> SkipSecondName = names.stream()
                                           .skip(2)
                                           .collect(Collectors.toList());
        System.out.println(SkipSecondName);                                                                
    }
}