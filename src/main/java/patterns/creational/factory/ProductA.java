package patterns.creational.factory;

public class ProductA implements IProduct {
    private final String name = "Product A";

    @Override
    public void produceMethod() {
        System.out.println(name + " produce Method");
    }
}
