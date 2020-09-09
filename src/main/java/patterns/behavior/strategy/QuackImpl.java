package patterns.behavior.strategy;

public class QuackImpl implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
