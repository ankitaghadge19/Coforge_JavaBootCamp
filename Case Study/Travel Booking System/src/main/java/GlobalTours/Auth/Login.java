package GlobalTours.Auth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import GlobalTours.Util.DBCon;

public class Login {
    static Connection con = DBCon.getConnection();

    public boolean authenticate(String emailId, String password) throws SQLException {
        String query = "SELECT * FROM User WHERE emailId = ? AND password = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, emailId);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
}