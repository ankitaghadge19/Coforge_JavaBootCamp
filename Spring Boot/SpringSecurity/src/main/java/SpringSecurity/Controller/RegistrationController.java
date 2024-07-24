package SpringSecurity.Controller;

import SpringSecurity.DTO.RegistrationRequest;
import SpringSecurity.Service.UserDetailsServiceImpl;
import SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody RegistrationRequest request) {
        userService.registerUser(request);
        return "User registered successfully";
    }
}