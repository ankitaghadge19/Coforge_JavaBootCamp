package GlobalTours.Index;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import GlobalTours.Auth.Login;
import GlobalTours.Auth.Register;
import GlobalTours.Models.User;
import GlobalTours.Models.BookTicket;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) throws SQLException {
        // Initialize Hibernate session factory
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        sessionFactory = metadata.buildSessionFactory();

        Scanner scanner = new Scanner(System.in);
        User loggedInUser = null;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1) Register");
            System.out.println("2) Login");
            System.out.println("3) Book Ticket");
            System.out.println("4) View My Bookings");
            System.out.println("5) Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    User newUser = new User();
                    System.out.print("Enter name: ");
                    newUser.set_name(scanner.nextLine());
                    System.out.print("Enter email ID: ");
                    newUser.set_emailId(scanner.nextLine());
                    System.out.print("Enter password: ");
                    newUser.set_password(scanner.nextLine());

                    Register reg = new Register();
                    if (reg.add(newUser) > 0) {
                        System.out.println("User registered successfully!");
                    } else {
                        System.out.println("Registration failed!");
                    }
                    break;

                case 2:
                    System.out.print("Enter email ID: ");
                    String emailId = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();

                    Login login = new Login();
                    if (login.authenticate(emailId, password)) {
                        System.out.println("Login successful!");
                        loggedInUser = retrieveUserDetails(emailId);
                    } else {
                        System.out.println("Login failed!");
                    }
                    break;

                case 3:
                    if (loggedInUser == null) {
                        System.out.println("You need to login first!");
                        break;
                    }
                    System.out.print("Enter source: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter date (yyyy-mm-dd): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter time (hh:mm): ");
                    String time = scanner.nextLine();

                    BookTicket ticket = new BookTicket(source, destination, date, time, loggedInUser);
                    if (ticket.book(sessionFactory)) {
                        System.out.println("Ticket booked successfully! Cost: " + ticket.getCost());
                    } else {
                        System.out.println("Booking failed! You might have already booked this route for the same date and time.");
                    }
                    break;

                case 4:
                    if (loggedInUser == null) {
                        System.out.println("You need to login first!");
                        break;
                    }
                    List<BookTicket> bookings = BookTicket.getAllBookings(loggedInUser, sessionFactory);
                    if (bookings.isEmpty()) {
                        System.out.println("No bookings found.");
                    } else {
                        System.out.println("Your Bookings:");
                        for (BookTicket booking : bookings) {
                            System.out.println("Ticket ID: " + booking.getTicketId() +
                                    ", Source: " + booking.getSource() +
                                    ", Destination: " + booking.getDestination() +
                                    ", Date: " + booking.getDate() +
                                    ", Time: " + booking.getTime() +
                                    ", Cost: " + booking.getCost());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exited!");
                    scanner.close();
                    sessionFactory.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again!");
            }
        }
    }

    private static User retrieveUserDetails(String emailId) {
        Session session = sessionFactory.openSession();
        User user = (User) session.createQuery("FROM User WHERE emailId = :emailId")
                .setParameter("emailId", emailId)
                .uniqueResult();
        session.close();
        return user;
    }
}
