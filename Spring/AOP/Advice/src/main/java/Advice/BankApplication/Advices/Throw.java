package Advice.BankApplication.Advices;

import org.springframework.aop.ThrowsAdvice;
import java.lang.reflect.Method;

public class Throw implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Throwable throwable) {
        System.out.println("Executing after throwing method: " + method.getName());
        System.out.println("Exception: " + throwable.getMessage());
    }
}
