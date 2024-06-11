package PostProcessor;

import PostProcessor.Models.Connection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
        public static void main(String[] args) {
            ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("PostProcessorBean.xml");
            Connection networkManager = (Connection) context.getBean("connection");
            networkManager.readData();
            context.close();
        }
}
