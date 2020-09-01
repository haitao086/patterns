package creational.factory;

public class Factory implements IFactory {

    @Override
    public IProduct produce(String name) {
         if (name.contains("B")) {
             return new ProductB() ;
         } else {
             return new ProductA() ;
         }
    }
}
