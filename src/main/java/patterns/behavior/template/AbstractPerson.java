package patterns.behavior.template;

public abstract class AbstractPerson {
    String name ;
    public void prepareGotoSchool() {
        dressUp();
        eatBreakfast();
        takeItems();
    }

    protected abstract void dressUp() ;
    protected abstract void eatBreakfast() ;
    protected abstract void takeItems() ;
}
