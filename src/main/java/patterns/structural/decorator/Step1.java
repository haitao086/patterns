package patterns.structural.decorator;

public class Step1 extends Decorator {
    public Step1(IHuman human) {
        super(human);
    }

    public void goHome() {
        System.out.println("go home");
    }

    public void findMap() {
        System.out.println("find the map...");
    }

    @Override
    public void wearCloth() {
        super.wearCloth();
        goHome();
    }

    @Override
    public void goSomewhere() {
        super.goSomewhere();
        findMap();
    }
}
