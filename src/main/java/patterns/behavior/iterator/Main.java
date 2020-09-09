package patterns.behavior.iterator;

public class Main {
    public static void main(String[] args) {
        Object[] objArray = {"One", "Two", "Three", "Four", "Five", "Six"};
        Aggregate agg = new ConcreteAggregate(objArray);
        Iterator it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem());
            it.next();
        }
    }
}

