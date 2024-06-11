package BeanInheritance;

import BeanInheritance.Models.Book;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
        public static void main(String[] args){
            ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeanInheritance.xml");
            Book b1 = (Book) context.getBean("CPP");
            System.out.println(b1.toString());

            Book b2 = (Book) context.getBean("JAVA");
            System.out.println(b2.toString());
    }
}