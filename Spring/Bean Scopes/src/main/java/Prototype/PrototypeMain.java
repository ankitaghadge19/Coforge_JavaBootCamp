package Prototype;


import Prototype.Models.PrototypeBean;
import Prototype.Models.PrototypeBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeMain {
    public static void main(String[] args) {
        // Creating the application context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        // Registering configuration class
        ctx.register(PrototypeBeanConfig.class);

        // Refreshing the application context to apply configurations
        ctx.refresh();

        // Getting beans from the context
        PrototypeBean bean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(bean1.hashCode());

        PrototypeBean bean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(bean2.hashCode());

        // Closing the context
        ctx.close();
    }
}
