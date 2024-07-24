package CartItem;

import CartItem.Models.Cart;
import CartItem.Models.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create items
        Item item1 = new Item();
        item1.setName("Item 1");

        Item item2 = new Item();
        item2.setName("Item 2");

        // Create cart
        Cart cart = new Cart();
        cart.setName("Cart 1");

        // Establish relationship
        cart.addItem(item1);
        cart.addItem(item2);

        // Persist the cart (which will also persist the items due to CascadeType.ALL)
        session.save(cart);

        transaction.commit();
        session.close();

        sessionFactory.close();
    }
}

