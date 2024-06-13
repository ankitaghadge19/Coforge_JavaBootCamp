package Advice.BankApplication.Advices;

import java.lang.reflect.Method;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Around implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        System.out.println("Executing around before method: " + method.getName());
        Object result;
        try {
            result = invocation.proceed();
        } catch (Exception e) {
            System.out.println("Executing around after throwing method: " + method.getName());
            throw e;
        }
        System.out.println("Executing around after returning method: " + method.getName());
        return result;
    }
}
