package Advice.BankApplication.Advices;

import org.springframework.aop.AfterAdvice;
import java.lang.reflect.Method;

public class After implements AfterAdvice {
    public void after(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Executing after finally method: " + method.getName());
    }
}