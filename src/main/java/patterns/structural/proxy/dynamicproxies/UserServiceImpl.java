package patterns.structural.proxy.dynamicproxies;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();

    UserServiceImpl () {
        users.add(new User("Tom","23")) ;
        users.add(new User("John","26")) ;
        users.add(new User("Annie","21")) ;
    }

    @Override
    public String getName(int id) {
        if (id >= users.size()) return "" ;
        return users.get(id).getName();

    }

    @Override
    public String getAge(int id) {
        if (id >= users.size()) return "" ;
        return users.get(id).getAge();
    }

}
