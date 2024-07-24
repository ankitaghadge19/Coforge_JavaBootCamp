package SpringBoot.Microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greet")
public class TextResource {
    @GetMapping(value = "testgreet")
    public  String getGreeting(){
        return  "This is Test Microservice in Spring-Boot...";
    }
    @GetMapping(value = "testgreet-with-name/{name}")
    public  String getGreetingwithName(@PathVariable String name){
        return  "This is Test Microservice in Spring-Boot...Welcome " + name.toUpperCase() + "!";
    }
}
