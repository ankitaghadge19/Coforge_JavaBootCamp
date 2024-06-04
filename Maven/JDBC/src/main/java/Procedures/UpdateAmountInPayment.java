package Procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateAmountInPayment {
    public static void main(String[] args) {

        Connection con = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "1234");

            // Prepare the callable statement
            CallableStatement callableStatement = con.prepareCall("{call updateAmount(?, ?)}");

            // Set input parameters
            callableStatement.setInt(1, 76);
            callableStatement.setDouble(2, 22.30);

            // Execute the stored procedure
            callableStatement.executeUpdate();

            System.out.println("Amount updated successfully!");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
