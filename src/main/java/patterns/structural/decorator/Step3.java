package patterns.structural.decorator;

public class Step3 extends Decorator {
    public Step3(IHuman human) {
        super(human);
    }

    public void findClothes() {
        System.out.println("find the clothes liked");
    }

    public void findTarget() {
        System.out.println("go to the place");
    }

    @Override
    public void wearCloth() {
        super.wearCloth();
        findClothes();
    }

    @Override
    public void goSomewhere() {
        super.goSomewhere();
        findTarget();
    }
}
