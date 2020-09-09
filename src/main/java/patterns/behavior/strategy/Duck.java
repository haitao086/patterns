package patterns.behavior.strategy;

public abstract class Duck {
    IFlyBehavior fb ;
    IQuackBehavior qb;
    public void fly() {
        fb.fly();
    }
    public void quack() {
        qb.quack();
    }
    public abstract void display() ;
}
