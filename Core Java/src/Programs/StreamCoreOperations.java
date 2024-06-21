package Programs;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCoreOperations {

    public static void main(String[] args) {
        // Creating a list of names
        List<String> names = new ArrayList<>();
        
        // Adding names to the list
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
        
        // Non-Terminal Operations
        // Filter names starting with "J"
        List<String> filteredNames = names.stream()
                                          .filter((s) -> s.startsWith("J"))
                                          .collect(Collectors.toList());
        System.out.println("Names starting with 'J': " + filteredNames);
        
        // Get the length of each name
        List<Integer> nameLengths = names.stream()
                                         .map(String::length)
                                         .collect(Collectors.toList());
        System.out.println("Length of each name: " + nameLengths);
        
        // Get a list of unique names
        List<String> distinctNames = names.stream()
                                          .distinct()
                                          .collect(Collectors.toList());
        System.out.println("Unique names: " + distinctNames);
        
        // Limit the number of names to print
        List<String> limitNames = names.stream()
                                       .limit(3)
                                       .collect(Collectors.toList());
        System.out.println("Limited names: " + limitNames);
        
        System.out.println("======Terminal Operations=====");
        
        // Terminal Operations
        // Check if any name starts with "A"
        boolean anyMatch = names.stream().anyMatch(name -> name.startsWith("A"));
        System.out.println("Any name starts with 'A': " + anyMatch);
        
        // Collect all names into a List
        List<String> list = names.stream()
				.collect(Collectors.toList());
        System.out.println(list);
        
        // Count the total number of names
        long count = names.stream().count();
        System.out.println("Total number of names: " + count);
        
        // Find the first name in the list
        String findFirst = names.stream().findFirst().orElse("No names found!");
        System.out.println("First name: " + findFirst);
        
        // forEach: Print each name (no guaranteed order in parallel streams)
        names.stream().forEach(System.out::print);
        System.out.println(); // To add a newline after forEach printing
        
        // forEachOrdered: Print each name in encounter order (useful in parallel streams)
        names.stream().forEachOrdered(System.out::println);
        
        // Concatenate all names into a single string
        System.out.println("Concatenating names: ");
        Optional<String> concat;
        concat = names.stream().reduce(String::concat);
        System.out.println(concat.orElse("")); // Using orElse to handle Optional
        
        // Concatenate all names into a single string without spaces
        String concatenatedWithSpace = names.stream().reduce("", String::concat);
        System.out.println(concatenatedWithSpace);
        
        // Sort names alphabetically
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);   
        
        // Skip the first 2 names in the list
        List<String> skippedList = names.stream()
                                        .skip(2)
                                        .collect(Collectors.toList());
        System.out.println("Names after skipping the first 2: " + skippedList);
         
        // Convert the stream to an array
        Object[] array = names.stream().toArray();
        System.out.println("Printing array list: ");
        for(Object obj: array) {
        	System.out.print(obj + " ");
        }
    }
}
