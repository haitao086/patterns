package patterns.behavior.iterator;

public class IteratorImpl implements Iterator {

    private ConcreteAggregate agg ;
    private int index = 0 ;
    private int size = 0 ;

    public IteratorImpl(ConcreteAggregate agg) {
        this.agg = agg;
        this.size = agg.size();
        this.index = 0 ;
    }

    @Override
    public void first() {
        index = 0 ;
    }

    @Override
    public void next() {
        index++ ;
    }

    @Override
    public boolean isDone() {
        return index >= size;
    }

    @Override
    public Object currentItem() {
        return agg.getElement(index);
    }
}
