package patterns.structural.proxy.dynamicproxies;

import net.sf.cglib.proxy.Enhancer;

public class CglibMain {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(cglibProxy);
        UserService userService = (UserService) enhancer.create();
        userService.getName(1);
        userService.getAge(1);
    }
}
