package AnnotationBased.Configuration;

import AnnotationBased.Models.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean(name="country")
    public Country getCountry()
    {
        return new Country("India");
    }
}
