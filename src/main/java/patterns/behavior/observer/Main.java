package patterns.behavior.observer;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver() ;

        PoliceMan p = new PoliceMan() ;
        SecurityGuard s = new SecurityGuard() ;
        Thief t = new Thief() ;

        driver.addObserver(p);
        driver.addObserver(s);
        driver.addObserver(t);

        driver.notifiObserver();
    }
}
