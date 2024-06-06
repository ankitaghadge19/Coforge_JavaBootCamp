import Models.User;
import Util.UserUtil;
import jakarta.transaction.SystemException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SystemException {

        User user1 = new User("Rubby", LocalDate.of(1996, 5, 10));
        User user2 = new User("James", LocalDate.of(1994, 10, 3));
        Transaction transaction = null;

        try (Session session = UserUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            try{
                session.persist((user1));
                session.persist(user2);
                transaction.commit();
            }catch(Exception e){
                if(transaction.getStatus() == TransactionStatus.ACTIVE){
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        try(Session session = UserUtil.getSessionFactory().openSession()){
            List<User> books = session.createQuery("from User", User.class).list();
            books.forEach(b -> {
                System.out.println("Print User name : " + b.getName());
            });
        } catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
