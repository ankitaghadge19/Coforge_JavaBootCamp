package GlobalTours.Index;

import java.sql.SQLException;
import java.util.Scanner;

import GlobalTours.Auth.Login;
import GlobalTours.Auth.Register;
import GlobalTours.Models.User;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1) Register");
            System.out.println("2) Login");
            System.out.println("3) Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    User newUser = new User();
                    System.out.print("Enter name: ");
                    newUser.set_name(scanner.nextLine());
                    System.out.print("Enter email ID: ");
                    newUser.set_emailId(scanner.nextLine());
                    System.out.print("Enter password: ");
                    newUser.set_password(scanner.nextLine());

                    Register reg = new Register();
                    if (reg.add(newUser) > 0) {
                        System.out.println("User registered successfully!");
                    } else {
                        System.out.println("Registration failed!");
                    }
                    break;

                case 2:
                    System.out.print("Enter email ID: ");
                    String emailId = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();

                    Login login = new Login();
                    if (login.authenticate(emailId, password)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Login failed!");
                    }
                    break;

                case 3:
                    System.out.println("Exited!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again!");
            }
        }
    }
}
