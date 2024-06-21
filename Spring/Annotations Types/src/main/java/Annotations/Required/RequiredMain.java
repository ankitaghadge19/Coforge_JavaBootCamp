package Annotations.Required;

import Annotations.Required.Models.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredMain {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("Required.xml");
            Book b1 = (Book) context.getBean("book");
            System.out.println("Name : " + b1.getName() );
            System.out.println("BookId : " + b1.getBookId() );
        }
}
