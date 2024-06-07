package CRUD.PreparedStatement;

import java.sql.*;

public class SelectRecord {
    static final String dbUrl = "jdbc:mysql://localhost:3306/coforgedata";
    static final String username = "root";
    static final String password = "1234";

    public static void main(String[] args) {

        String sqlSelect = "SELECT * FROM STUDENT";

        try (Connection con = DriverManager.getConnection(dbUrl, username, password);
             PreparedStatement pstmt = con.prepareStatement(sqlSelect)) {

            ResultSet rs = pstmt.executeQuery(sqlSelect);

            while (rs.next()) {
                int sid = rs.getInt("sid");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String course = rs.getString("course");

                System.out.println("ID: " + sid + ", FName: " + fname + ", LName: " + lname + ", Course: " + course);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
