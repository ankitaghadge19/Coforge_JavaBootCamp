package Singleton.Models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SingletonBeanConfig {
    @Bean
    @Scope(value="singleton")
    public  SingletonBean getBean(){
        return new SingletonBean();
    }
}
