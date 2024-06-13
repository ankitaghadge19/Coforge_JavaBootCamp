package Advice.BankApplication.Advices;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class AfterReturning implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Executing after returning method: " + method.getName());
    }
}
