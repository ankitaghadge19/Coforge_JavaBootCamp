package Advice.BankApplication;

import Advice.BankApplication.Models.BankService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BankApplication.xml");
        BankService bankService = (BankService) context.getBean("BankServiceProxy");

        System.out.println("Calling deposit...");
        bankService.deposit(500);
        System.out.println("--------------");

        System.out.println("Calling withdraw...");
        try {
            bankService.withdraw(200);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("--------------");

        System.out.println("Calling checkBalance...");
        bankService.checkBalance();
        System.out.println("--------------");

        System.out.println("Calling withdraw with insufficient balance...");
        try {
            bankService.withdraw(2000);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("--------------");
    }
}
