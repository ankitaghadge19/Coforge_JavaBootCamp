package Advice.BankApplication.Advices;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class Before implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Executing before method: " + method.getName());
    }
}
