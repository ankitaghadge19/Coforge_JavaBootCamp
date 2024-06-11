package DependencyInjection.InjectingCollection;

import DependencyInjection.InjectingCollection.Models.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Product product = (Product) context.getBean("product");
        System.out.println(product);
    }
}
