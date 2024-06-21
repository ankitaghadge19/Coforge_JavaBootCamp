package TypesOfInterface;

import java.io.*;

// Book class that implements Serializable interface
class Book implements Serializable {
    int bid;
    String title;
    transient double price;  // This field won't be serialized

    // Constructor to initialize the Book object
    public Book(int bid, String title, double price) {
        this.bid = bid;
        this.title = title;
        this.price = price;
    }
}

public class Serialization {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // Creating a Book object
        Book book = new Book(101, "Life Worth Living", 500);

        // Serialization process
        try {
            // Create a file output stream to write the serialized object to a file named "BookInfo"
            FileOutputStream fos = new FileOutputStream("BookInfo");
            // Create an object output stream to write the Book object
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);

            // Write the Book object to the output stream
            objectOutputStream.writeObject(book);
            System.out.println("Book object serialized!");
            // Close the file output stream
            fos.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        // Deserialization process
        // Create a file input stream to read the serialized object from the file named "BookInfo"
        FileInputStream fileInputStream = new FileInputStream("BookInfo");
        // Create an object input stream to read the Book object
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // Read the Book object from the input stream
        Book bookInfo = (Book) objectInputStream.readObject();
        // Print the deserialized Book object's attributes
        System.out.println(bookInfo.bid + " " + bookInfo.title + " " + bookInfo.price);
        // Close the file input stream
        fileInputStream.close();
    }
}
