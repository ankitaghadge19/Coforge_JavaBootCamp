package BeanLifeCycle;

import BeanLifeCycle.Models.Customer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        Customer obj = ctx.getBean("customer", Customer.class);
        System.out.println("Name= " + obj.getName());
        ctx.close();
    }
}
