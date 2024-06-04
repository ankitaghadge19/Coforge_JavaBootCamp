package GlobalTours.Models;

public class User {

    String name;
    String emailId;
    String password;

    public User() {}

    public User(String name, String emailId, String password)
    {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
    }

    public String get_emailId()
    {
        return emailId;
    }

    public void set_emailId(String emailId)
    {
        this.emailId = emailId;
    }

    public String get_name()
    {
        return name;
    }

    public void set_name(String name)
    {
        this.name = name;
    }

    public String get_password()
    {
        return password;
    }

    public void set_password(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "User [emailId=" + emailId + ", name=" + name + ", password=" + password+ "]";
    }
}