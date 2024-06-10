package DependencyInjection.InnerBeans;

import DependencyInjection.InnerBeans.Models.InvoiceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shopping {
    public static void main(String a[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        InvoiceGenerator invoice = (InvoiceGenerator) context.getBean("invoicebean");
        invoice.generateInvoice();
    }
}
