package patterns.structural.adapter;

public class ConcreteITarget implements ITarget {
    @Override
    public void request() {
        System.out.println("Function by normal class...");
    }
}
