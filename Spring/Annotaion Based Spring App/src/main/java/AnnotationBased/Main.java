package AnnotationBased;


import AnnotationBased.Configuration.ApplicationConfiguration;
import AnnotationBased.Models.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Country countryObj = (Country) appContext.getBean("country");
        String countryName=countryObj.getCountryName();

        System.out.println("Country Name: "+ countryName);
    }
}