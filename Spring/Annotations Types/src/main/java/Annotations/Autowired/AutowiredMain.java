package Annotations.Autowired;

import Annotations.Autowired.Models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Autowired.xml");

        // Get the Employee bean
        Employee employee = (Employee) context.getBean("employee");
        employee.setName("Rubby Bell");
        employee.getDepartment().setDeptName("IT");

        // Display employee details
        employee.displayEmployeeDetails();
    }
}
