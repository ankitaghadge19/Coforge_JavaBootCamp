package com.java.collections;
import java.util.List;
import java.util.ArrayList;

class Book{
	int id;
	String title;
	double price;
	
	public Book() {
		
	}
	
     public Book( int id, String title, double price) {
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

public class UserDefinedArrayList {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
	
		// Add books to the ArrayList
		bookList.add(new Book(1, "Java", 100));
        bookList.add(new Book(2, "Python", 150));
        bookList.add(new Book(3, "C++", 120));
        
        // Iterate over the ArrayList
        for(Book book: bookList) {
        	System.out.println(book);
        }
	}
}
