package OneToMany.Main;

import OneToMany.Account.SavingAccount;
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
        savingAccount1.add(1000);
        savingAccount1.add(500);

        SavingAccount savingAccount2 = new SavingAccount(104, "Bella Swan");
        savingAccount2.add(2000);
        savingAccount2.add(300);

        // Save SavingAccount objects
        session.save(savingAccount1);
        session.save(savingAccount2);

        // Commit transaction and close session
        transaction.commit();
        session.close();
        System.out.println("Amount is deposited!");
    }
}