package ManyToMany;

import ManyToMany.Models.Employee;
import ManyToMany.Models.Project;
import ManyToMany.Models.EmployeeProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        // Configure and build session factory
        StandardServiceRegistry standardServiceRegistry =
                new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml")
                        .build();
        Metadata metadata = new MetadataSources(standardServiceRegistry)
                .getMetadataBuilder()
                .build();
        SessionFactory sessionFactory = metadata.buildSessionFactory();

        // Open session and begin transaction
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create Employee objects
        Employee employee1 = new Employee(101, "hardin@example.com");
        Employee employee2 = new Employee( 102, "tessa@example.com");

        // Create Project objects
        Project project1 = new Project("Project A");
        Project project2 = new Project("Project B");

        // Create EmployeeProject objects and associate them
        EmployeeProject employeeProject1 = new EmployeeProject(employee1, project1);
        EmployeeProject employeeProject2 = new EmployeeProject(employee1, project2);
        EmployeeProject employeeProject3 = new EmployeeProject(employee2, project1);

        // Save Employee, Project, and EmployeeProject objects
        session.save(employee1);
        session.save(employee2);
        session.save(project1);
        session.save(project2);
        session.save(employeeProject1);
        session.save(employeeProject2);
        session.save(employeeProject3);

        // Commit transaction and close session
        transaction.commit();
        session.close();
        System.out.println("EmployeeProject relationships saved successfully!");
    }
}
