package patterns.behavior.strategy;



public class FlyImpl implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
