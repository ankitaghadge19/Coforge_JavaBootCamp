package InvoiceGenerator;

import InvoiceGenerator.Models.Invoice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InvoiceGenerator {
    public static void main(String a[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Invoice invoice = (Invoice) context.getBean("invoice");
        invoice.generateInvoice();
    }
}
