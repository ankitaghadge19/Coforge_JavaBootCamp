package OneToOne;

import OneToOne.Models.Account;
import OneToOne.Models.Employee;
import OneToOne.Util.EmployeeUtil;
import jakarta.transaction.SystemException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.util.List;

public class Main {
    public static void main(String[] args) throws SystemException {
        // Create Account
        Account account = new Account();
        account.setAccountNo("101");

        // Create Employee
        Employee employee = new Employee();
        employee.setEmail("rubby@gmail.com");
        employee.setFname("Rubby");
        employee.setLname("Bell");
        employee.setAccount(account);

        Transaction transaction = null;

        try (Session session = EmployeeUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            try {
                session.persist(employee);
                transaction.commit();
            } catch (Exception e) {
                if (transaction.getStatus() == TransactionStatus.ACTIVE) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retrieve and print Employees
        try (Session session = EmployeeUtil.getSessionFactory().openSession()) {
            List<Employee> employees = session.createQuery("from Employee", Employee.class).list();
            employees.forEach(emp -> {
                System.out.println("Employee name: " + emp.getFname() + " " + emp.getLname());
                Account acc = emp.getAccount();
                if (acc != null) {
                    System.out.println("Account No: " + acc.getAccountNo());
                }
            });
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
