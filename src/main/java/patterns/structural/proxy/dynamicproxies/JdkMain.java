package patterns.structural.proxy.dynamicproxies;

import java.lang.reflect.Proxy;

public class JdkMain {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl() ;
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                jdkInvocationHandler) ;
         userServiceProxy.getName(0);
         userServiceProxy.getAge(0);

    }
}
