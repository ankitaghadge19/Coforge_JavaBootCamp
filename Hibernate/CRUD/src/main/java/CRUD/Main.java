package CRUD;

import CRUD.Models.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    private static SessionFactory sessionFcatory = new Configuration().configure().buildSessionFactory();

    // Create Customer
    public void createCustomer(Customer customer){
        Transaction transaction = null;
        try(Session session = sessionFcatory.openSession()){
            transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Read Customer
    public Customer getCustomer(Long customerId){
        try(Session session = sessionFcatory.openSession()){
            return session.get(Customer.class, customerId);
        }
    }

    // Update Customer
    public void updateCustomer(Customer customer){
        Transaction transaction = null;
        try(Session session = sessionFcatory.openSession()){
            transaction = session.beginTransaction();
            session.update(customer);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Delete Customer
    public void deleteCustomer(Long customerId){
        Transaction transaction = null;
        try(Session session = sessionFcatory.openSession()){
            transaction = session.beginTransaction();
            Customer customer = session.get(Customer.class, customerId);
            if(customer != null){
                session.delete(customer);
                System.out.println("Customer is deleted");
            }
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Main main = new Main();

        // Create customer
        Customer newCustomer = new Customer();
        newCustomer.setFname("Rubby");
        newCustomer.setLname("Bell");
        newCustomer.setDob(new Date());
        newCustomer.setEmail("rubby@gmail.com");
        main.createCustomer(newCustomer);

        // Read customer
        Customer customer = main.getCustomer(newCustomer.getCustomerId());
        System.out.println("Customer: " + customer.getFname() + " " + customer.getLname());

        // Upadte customer
        customer.setEmail("rubbybell@gmail.com");
        main.updateCustomer(customer);

        // Delete customer
        main.deleteCustomer((customer.getCustomerId()));
    }
}
