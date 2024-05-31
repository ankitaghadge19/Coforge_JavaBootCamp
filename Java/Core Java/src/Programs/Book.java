package Programs;
import java.util.Scanner;

public class Book {
    // Properties of the Book class
    private int bookId;
    private String title;
    private float price;
    

    public Book(int bookId, String title, float price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public void displayBookDetails() {
    	System.out.printf("Book ID: %d%n", bookId);
        System.out.printf("Title: %s%n", title);
        System.out.printf("Price: %.2f%n", price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for bookId
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Taking user input for title
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        
        // Taking user input for title
        System.out.print("Enter Book Price: ");
        float price = scanner.nextFloat();

        // Creating a Book object
        Book book = new Book(bookId, title, price);

        // Displaying the book details
        System.out.println("Displaying entered data: ");
        book.displayBookDetails();

        scanner.close();
    }
}
