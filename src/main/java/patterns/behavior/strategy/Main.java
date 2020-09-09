package patterns.behavior.strategy;

public class Main {
    public static void main(String[] args) {
        Duck duck = new GreenDuck();

        duck.display();
        duck.fly();
        duck.quack();
    }
}
