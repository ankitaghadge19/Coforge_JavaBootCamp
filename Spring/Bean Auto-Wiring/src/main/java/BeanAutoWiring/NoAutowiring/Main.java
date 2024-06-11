package BeanAutoWiring.NoAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import BeanAutoWiring.Models.Employee;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =   new ClassPathXmlApplicationContext("NoAutowiring.xml");
        Employee employee = (Employee) context.getBean ("employee");

        System.out.println(employee.getFullName());
        System.out.println(employee.getDepartment().getName());
    }
}
