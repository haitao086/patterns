package patterns.creational.factory;

public class Production {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct pa = factory.produce("A") ;
        IProduct pb = factory.produce("B") ;
        pa.produceMethod();
        pb.produceMethod();
    }
}
