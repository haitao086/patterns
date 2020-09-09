package patterns.behavior.observer;

public class Thief implements IObserver {

    @Override
    public void update() {
        System.out.println("Truck is moving, actions need");
    }
}
