package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {
    static final String dbUrl = "jdbc:mysql://localhost:3306/coforgedata";
    static final String username = "root";
    static final String password = "1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Id: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter First Name: ");
        String fname = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lname = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        sc.close();

        try (Connection con = DriverManager.getConnection(dbUrl, username, password);
             Statement stmt = con.createStatement()) {

            String sqlCreate = String.format("UPDATE STUDENT SET fname='%s', lname='%s', course='%s' WHERE sid=%d", fname, lname, course, sid);;

            stmt.executeUpdate(sqlCreate);
            System.out.println("Record updated in Student table!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
