package patterns.structural.adapter;

public class Client {
    public static void main(String[] args) {

        // call nethod from normal class
        ITarget concreteTarget = new ConcreteITarget();
        concreteTarget.request();

        System.out.println("-------------");

        // call method from specific class, using same method name.
        ITarget adpter = new Adapter();
        adpter.request();
    }
}
