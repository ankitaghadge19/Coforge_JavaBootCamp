package CRUD.PreparedStatement;

import java.sql.*;
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

        String sqlDelete ="DELETE FROM STUDENT WHERE sid = ?";

        try (Connection con = DriverManager.getConnection(dbUrl, username, password);
             PreparedStatement pstmt = con.prepareStatement(sqlDelete)) {

            pstmt.setInt(1, sid);

            pstmt.executeUpdate();
            System.out.println("Record deleted from the Student table!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
