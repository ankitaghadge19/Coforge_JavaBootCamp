package Collections;
import java.util.HashSet;
import java.util.Set;

class BookDetails{
	int id;
	String title;
	double price;
	
	public BookDetails() {
		
	}
	
     public BookDetails( int id, String title, double price) {
    	 this.id = id;
    	 this.title = title;
    	 this.price = price;
	}
     
     // Override toString() method for better readability when printing Book objects
     @Override
     public String toString() {
         return "Book [id=" + id + ", title=" + title + ", price=" + price + "]";
     }
}

public class UserDefinedHashSet {

	public static void main(String[] args) {
		
		Set<BookDetails> bookSet = new HashSet<>();
		
		// Add books to the HashSet
		bookSet.add(new BookDetails(1, "Java", 100));
		bookSet.add(new BookDetails(2, "Python", 150));
		bookSet.add(new BookDetails(3, "C++", 120));
        
		// Adding duplicate 
		bookSet.add(new BookDetails(3, "C++", 120));
		
		// Iterate over the HashSet
        for(BookDetails book: bookSet) {
        	System.out.println(book);
        }
	}
}
