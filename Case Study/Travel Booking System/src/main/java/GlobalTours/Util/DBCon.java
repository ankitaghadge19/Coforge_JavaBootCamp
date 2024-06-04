package GlobalTours.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

    private static Connection con = null;

    static {
        String url = "jdbc:mysql://localhost:3306/TravelBookingSystem";
        String user = "root";
        String password = "1234";
        try {
            // Load the new MySQL JDBC driver (optional, for clarity and backward compatibility)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return con;
    }
}
