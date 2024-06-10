package DependencyInjection.SetterBased;

import DependencyInjection.SetterBased.Models.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student s1 = (Student)context.getBean("student");
        s1.display();
    }
}
