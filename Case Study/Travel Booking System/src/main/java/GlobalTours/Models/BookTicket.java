package GlobalTours.Models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import GlobalTours.Models.User;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class BookTicket {
    private static Map<String, Integer> routeCostMap = new HashMap<>();

    static {
        routeCostMap.put("Pune-Mumbai", 300);
        routeCostMap.put("Nashik-Pune", 400);
        routeCostMap.put("Pune-Nagpur", 200);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    private String source;

    private String destination;

    private int cost;

    private String date;

    private String time;

    private String travelType;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


    public BookTicket() {
    }

    public BookTicket(String source, String destination, String date, String time, User user) {
        this.source = source;
        this.destination = destination;
        this.cost = routeCostMap.getOrDefault(source + "-" + destination, 0);
        this.date = date;
        this.time = time;
        this.travelType = "train";
        this.user = user;
    }

    // Getters and Setters
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
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

    public int getCost() {
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
        String hql = "FROM BookTicket WHERE source = :source AND destination = :destination AND date = :date AND time = :time";
        Query query = session.createQuery(hql);
        query.setParameter("source", this.source);
        query.setParameter("destination", this.destination);
        query.setParameter("date", this.date);
        query.setParameter("time", this.time);
        BookTicket existingBooking = (BookTicket) query.uniqueResult();

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
}
