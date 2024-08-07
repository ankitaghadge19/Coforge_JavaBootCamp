package BeanLifeCycle.Models;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements DisposableBean, InitializingBean {

    private String name;

    Customer() {
        System.out.println("Constructor of Customer bean is invoked!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Bean initialization code
    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("Initializing method of Customer bean is invoked!");
    }

    //Bean destruction code
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method of Customer bean is invoked!");
    } ;
}
