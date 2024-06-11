package Singleton;

import Singleton.Models.SingletonBean;
import Singleton.Models.SingletonBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonMain {
    public static void main(String[] args) {
        // Creating the application context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        // Registering configuration class
        ctx.register(SingletonBeanConfig.class);

        // Refreshing the application context to apply configurations
        ctx.refresh();

        // Getting beans from the context
        SingletonBean bean1 = ctx.getBean(SingletonBean.class);
        System.out.println(bean1.hashCode());

        SingletonBean bean2 = ctx.getBean(SingletonBean.class);
        System.out.println(bean2.hashCode());

        // Closing the context
        ctx.close();
    }
}
