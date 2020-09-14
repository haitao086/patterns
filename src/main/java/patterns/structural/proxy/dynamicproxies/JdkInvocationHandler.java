package patterns.structural.proxy.dynamicproxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class JdkInvocationHandler implements InvocationHandler {

    private Object target;

    JdkInvocationHandler() {
        super();
    }

    JdkInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("getName".equals(method.getName())) {
            System.out.println("***** before " + method.getName() + "  *********");
            Object result = method.invoke(target, args);
            System.out.println("result : " +  result);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("***** after  " + method.getName() + "  *********");
            return result;
        } else {
            Object result = method.invoke(target, args);
            return result;
        }


    }
}
