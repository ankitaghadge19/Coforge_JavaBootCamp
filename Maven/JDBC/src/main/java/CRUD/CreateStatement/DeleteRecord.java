package CRUD.CreateStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {
    static final String dbUrl = "jdbc:mysql://localhost:3306/coforgedata";
    static final String username = "root";
    static final String password = "1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Id: ");
        int sid = sc.nextInt();
        sc.nextLine();

        sc.close();

        try (Connection con = DriverManager.getConnection(dbUrl, username, password);
             Statement stmt = con.createStatement()) {

            String sqlDelete = String.format("DELETE FROM STUDENT WHERE sid=%d", sid);

            stmt.executeUpdate(sqlDelete);
            System.out.println("Record deleted from the Student table!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
