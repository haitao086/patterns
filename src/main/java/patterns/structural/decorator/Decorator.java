package patterns.structural.decorator;

public abstract class Decorator implements IHuman {
    private IHuman human ;
    public Decorator(IHuman human) {
        this.human = human;
    }

    @Override
    public void wearCloth() {
        human.wearCloth();
    }

    @Override
    public void goSomewhere() {
        human.goSomewhere();
    }
}
