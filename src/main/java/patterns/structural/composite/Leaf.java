package patterns.structural.composite;

public class Leaf extends Component {

    // leaf not able to add or remove, so keep it empty ;
    @Override
    public void add(Component c) {
//          System.out.println("");
    }

    @Override
    public void remove(Component c) {
//
    }

    @Override
    public void eachChild() {
        System.out.println(name + " showed");
    }
}
