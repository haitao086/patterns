package patterns.structural.decorator;

public class Person implements IHuman {
    @Override
    public void wearCloth() {
        System.out.println("what should I wear?");
    }

    @Override
    public void goSomewhere() {
        System.out.println("where to go?");
    }
}
