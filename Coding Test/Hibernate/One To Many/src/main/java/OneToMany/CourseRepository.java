package OneToMany;

import OneToMany.Models.Course;
import OneToMany.Models.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CourseRepository {
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

        // Create Course objects and add students
        Course course1 = new Course("CS");
        Student student1 = new Student("Ruby");
        Student student2 = new Student("James");
        course1.addStudent(student1);
        course1.addStudent(student2);

        Course course2 = new Course("IT");
        Student student3 = new Student("Hardin");
        Student student4 = new Student("Tessa");
        course2.addStudent(student3);
        course2.addStudent(student4);

        // Save Course objects
        session.save(course1);
        session.save(course2);

        // Commit transaction and close session
        transaction.commit();
        session.close();
        System.out.println("Courses and students are saved!");
    }
}
