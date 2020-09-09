package patterns.behavior.observer;

public class PoliceMan implements IObserver {

    @Override
    public void update() {
        System.out.println("Truck is moving, avoid robbery");
    }
}
