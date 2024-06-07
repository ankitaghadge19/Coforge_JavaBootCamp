package OneToManyUsingAnnotations.Main;

import OneToManyUsingAnnotations.Account.Deposit;
import OneToManyUsingAnnotations.Account.SavingAccount;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CustomerAccountRepository {
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

        // Create SavingAccount objects and add deposits
        SavingAccount savingAccount1 = new SavingAccount(103, "Edward Cullen");
        Deposit deposit1 = new Deposit(1000);
        Deposit deposit2 = new Deposit(500);
        savingAccount1.addDeposit(deposit1);
        savingAccount1.addDeposit(deposit2);

        SavingAccount savingAccount2 = new SavingAccount(104, "Bella Swan");
        Deposit deposit3 = new Deposit(2000);
        Deposit deposit4 = new Deposit(300);
        savingAccount2.addDeposit(deposit3);
        savingAccount2.addDeposit(deposit4);

        // Save SavingAccount objects
        session.save(savingAccount1);
        session.save(savingAccount2);

        // Commit transaction and close session
        transaction.commit();
        session.close();
        System.out.println("Amount is deposited!");
    }
}
