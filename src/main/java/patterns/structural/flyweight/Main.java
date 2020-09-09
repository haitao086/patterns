package patterns.structural.flyweight;

public class Main {

    FlyweightFactory factory = new FlyweightFactory();
    Flyweight fly1;
    Flyweight fly2;
    Flyweight fly3;
    Flyweight fly4;
    Flyweight fly5;
    Flyweight fly6;

    /**
     * Creates a new instance of Main
     */
    public Main() {
        fly1 = factory.getFlyWeight("Google");
        fly2 = factory.getFlyWeight("Google");
        fly3 = factory.getFlyWeight("Facebook");
        fly4 = factory.getFlyWeight("Twitter");
        fly5 = factory.getFlyWeight("Amazon");
        fly6 = factory.getFlyWeight("Airbnb");
    }

    public void showFlyweight() {
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();
        int objSize = factory.getFlyweightSize();
        System.out.println("objSize = " + objSize);
    }

    public static void main(String[] args) {
        System.out.println("The FlyWeight Pattern!");
        Main fp = new Main();
        fp.showFlyweight();
    }

}

