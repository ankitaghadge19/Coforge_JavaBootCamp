package CRUD.PreparedStatement;

import java.sql.*;
import java.util.Scanner;

public class InsertRecord {
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

        String sqlInsert = "INSERT INTO STUDENT (sid, fname, lname, course) VALUES (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(dbUrl, username, password);
             PreparedStatement pstmt = con.prepareStatement(sqlInsert)) {

            pstmt.setInt(1, sid);
            pstmt.setString(2, fname);
            pstmt.setString(3, lname);
            pstmt.setString(4, course);

            pstmt.executeUpdate();
            System.out.println("Record added in Student table!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
