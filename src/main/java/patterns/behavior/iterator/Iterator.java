package patterns.behavior.iterator;

public interface Iterator {
    void first() ;
    void next() ;
    boolean isDone() ;
    Object currentItem() ;

}
