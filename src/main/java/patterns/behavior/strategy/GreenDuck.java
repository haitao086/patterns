package patterns.behavior.strategy;

public class GreenDuck extends Duck {

    public GreenDuck() {
        fb = new FlyImpl() ;
        qb = new QuackImpl();
    }

    @Override
    public void display() {
        System.out.println("I am a green duck");
    }
}
