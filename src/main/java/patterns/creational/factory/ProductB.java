package patterns.creational.factory;

public class ProductB implements IProduct {
    private final String name = "Product B";

    @Override
    public void produceMethod() {
        System.out.println(name + " produce Method");
    }
}
