package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    List<Component> list = new ArrayList<>() ;

    @Override
    public void add(Component c) {
        list.add(c) ;
    }

    @Override
    public void remove(Component c) {
        list.remove(c) ;
    }

    @Override
    public void eachChild() {
        System.out.println(name + " showed");
        for (Component c : list) {
            c.eachChild();
        }
    }
}
