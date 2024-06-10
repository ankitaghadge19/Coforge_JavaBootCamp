package GlobalTours.Models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import GlobalTours.Models.User;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
    private static Map<String, Integer> routeCostMap = new HashMap<String, Integer>() {{
        put("Pune-Mumbai", 300);
        put("Nashik-Pune", 400);
        put("Pune-Nagpur", 200);
    }};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    private String source;

    private String destination;

    private float cost;

    private String date;

    private String time;

    private String travelType;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


    public Booking() {
    }

    public Booking(String source, String destination, String date, String time, User user) {
        this.source = source;
        this.destination = destination;
        this.cost = routeCostMap.getOrDefault(source + "-" + destination, 0);
        this.date = date;
        this.time = time;
        this.travelType = "train";
        this.user = user;
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int ticketId) {
        this.bookingId = ticketId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean book(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Check if the user already has a booking for the same route, date, and time
        String hql = "FROM Booking WHERE source = :source AND destination = :destination AND date = :date AND time = :time";
        Query query = session.createQuery(hql);
        query.setParameter("source", this.source);
        query.setParameter("destination", this.destination);
        query.setParameter("date", this.date);
        query.setParameter("time", this.time);
        Booking existingBooking = (Booking) query.uniqueResult();

        if (existingBooking != null) {
            transaction.commit();
            session.close();
            return false; // Already booked for this route, date, and time
        }

        // Save the new booking
        session.save(this);
        transaction.commit();
        session.close();
        return true;
    }

    public static List<Booking> getAllBookings(User user, SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        String hql = "FROM Booking WHERE user = :user";
        Query query = session.createQuery(hql);
        query.setParameter("user", user);
        List<Booking> bookings = query.list();
        session.close();
        return bookings;
    }
}
