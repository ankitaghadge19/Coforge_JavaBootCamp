package CRUD.CreateStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    static final String dbUrl = "jdbc:mysql://localhost:3306/coforgedata";
    static final String username = "root";
    static final String password = "1234";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(dbUrl, username, password);
             Statement stmt = con.createStatement()) {

            String sqlCreate = "CREATE TABLE STUDENT (sid INTEGER not null, fname VARCHAR(30), lname VARCHAR(30), course VARCHAR(30), PRIMARY KEY (sid))";

            stmt.executeUpdate(sqlCreate);
            System.out.println("Student table created in database coforgedata!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
