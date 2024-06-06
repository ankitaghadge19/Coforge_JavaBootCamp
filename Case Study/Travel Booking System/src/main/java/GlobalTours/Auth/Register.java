package GlobalTours.Auth;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import GlobalTours.Models.User;
import GlobalTours.Util.DBCon;

public class Register  {
    static Connection con
            = DBCon.getConnection();

    public int add(User user)
            throws SQLException
    {
        String query = "insert into User(name, emailId, password) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, user.get_name());
        ps.setString(2, user.get_emailId());
        ps.setString(3, user.get_password());
        int n = ps.executeUpdate();
        return n;
    }
}
