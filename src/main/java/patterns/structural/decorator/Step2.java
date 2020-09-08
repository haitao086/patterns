package patterns.structural.decorator;

public class Step2 extends Decorator {
    public Step2(IHuman human) {
        super(human);
    }

    public void goWardrope() {
        System.out.println("go wardrobe");
    }

    public void findPlaceOnMap() {
        System.out.println("find the place on the map...");
    }

    @Override
    public void wearCloth() {
        super.wearCloth();
        goWardrope();
    }

    @Override
    public void goSomewhere() {
        super.goSomewhere();
        findPlaceOnMap();
    }
}
