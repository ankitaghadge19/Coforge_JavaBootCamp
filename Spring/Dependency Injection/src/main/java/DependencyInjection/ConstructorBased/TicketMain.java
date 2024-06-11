package DependencyInjection.ConstructorBased;

import DependencyInjection.ConstructorBased.Models.Ticket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TicketMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Ticket t1 = (Ticket) context.getBean("ticket");
        t1.display();
    }
}
