package SpringBoot.JDBC.Controller;

import java.util.List;

import SpringBoot.JDBC.Model.User;
import SpringBoot.JDBC.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userservice;

    @GetMapping("/user")
    private List<User> getAllUser() {
        return userservice.getAllUsers();
    }

    //getting specific user
    @GetMapping("/user/{id}")
    private User getUser(@PathVariable("id") int id) {
        return userservice.getUserById(id);
    }

    //deleting specific user
    @DeleteMapping("/user/{id}")

    private void deleteUser(@PathVariable ("id") int id) {
        userservice.delete(id);
    }

    @PostMapping("/user")
    private int saveUser(@RequestBody User user) {
        userservice.saveOrUpdate(user);
        return user.getId();
    }
}