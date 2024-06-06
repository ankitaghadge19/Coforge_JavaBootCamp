package com.pack.main;

import com.pack.entity.Student;
import com.pack.hbutil.SessionFactoryprovider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentMain {
    public static void main(String[] args) {
        try{
            SessionFactory sessionFactory= SessionFactoryprovider.provideSessionFactory();
            Session session=sessionFactory.openSession();
            Transaction transaction=session.beginTransaction();
            Student student1=new Student(101,"James");
            Student student2=new Student(102,"Rubby");
            session.save(student1);
            session.save(student2);
            transaction.commit();
            sessionFactory.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}