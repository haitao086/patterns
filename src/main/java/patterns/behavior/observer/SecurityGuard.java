package patterns.behavior.observer;

public class SecurityGuard implements IObserver {

    @Override
    public void update() {
        System.out.println("Truck is moving, please take care of it");
    }
}
