package patterns.structural.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap flyweights = new HashMap();

    public FlyweightFactory() {
    }

    public Flyweight getFlyWeight(Object obj) {
        Flyweight flyweight = (Flyweight) flyweights.get(obj);
        if (flyweight == null) {
            //new  ConcreteFlyweight
            flyweight = new ConcreteFlyweight((String) obj);
            flyweights.put(obj, flyweight);
        }
        return flyweight;
    }

    public int getFlyweightSize() {
        return flyweights.size();
    }

}
