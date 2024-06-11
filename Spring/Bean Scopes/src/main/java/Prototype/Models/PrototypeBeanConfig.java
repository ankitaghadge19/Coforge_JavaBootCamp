package Prototype.Models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeBeanConfig {
    @Bean
    @Scope(value="prototype")
    public PrototypeBean getBean(){
        return new PrototypeBean();
    }
}
