package patterns.creational.abstractFactory;

public class Main {

    public static void main(String[] args) {
        // produce benz a car
        FactoryBenzA fa = new FactoryBenzA();
        fa.createEngine();
        fa.createAircondition();

        // produce benz b car
        FactoryBenzB fb = new FactoryBenzB();
        fb.createEngine();
        fb.createAircondition();

    }
}
