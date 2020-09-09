package patterns.behavior.template;

public class Teacher extends AbstractPerson{

    public Teacher(String name) {
        this.name = name ;
    }

    @Override
    protected void dressUp() {
        System.out.println(name + " dress professional");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println(name + " eat breakfast at school");
    }

    @Override
    protected void takeItems() {
        System.out.println(name + " bring books");
    }
}
