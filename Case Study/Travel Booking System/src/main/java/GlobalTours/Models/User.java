package GlobalTours.Models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String emailId;

    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Booking> bookings; // Changed from BookTicket

    public User() {}

    public User(String name, String emailId, String password)
    {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
    }

    public String get_emailId()
    {
        return emailId;
    }

    public void set_emailId(String emailId)
    {
        this.emailId = emailId;
    }

    public String get_name()
    {
        return name;
    }

    public void set_name(String name)
    {
        this.name = name;
    }

    public String get_password()
    {
        return password;
    }

    public void set_password(String password)
    {
        this.password = password;
    }

    public List<Booking> getBookings() { // Changed from BookTicket
        return bookings;
    }

    public void setBookings(List<Booking> bookings) { // Changed from BookTicket
        this.bookings = bookings;
    }

    @Override
    public String toString()
    {
        return "User [emailId=" + emailId + ", name=" + name + ", password=" + password+"]";
    }
}
