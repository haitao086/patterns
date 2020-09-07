package patterns.creational.factory;

public class MainTest {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct pa = factory.produce("A") ;
        IProduct pb = factory.produce("PB") ;
        pa.produceMethod();
        pb.produceMethod();
    }
}
