package patterns.structural.adapter;

public class Adapter extends Adaptee implements ITarget {
    @Override
    public void request() {
        super.specificRequest();
        System.out.println("call super function");
    }
}
