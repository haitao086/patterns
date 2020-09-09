package patterns.behavior.template;

public class Student extends AbstractPerson {
    public Student(String name) {
        this.name = name ;
    }
    @Override
    protected void dressUp() {
        System.out.println(name + " dress school clothes");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println(name + " eat breakfast at home");
    }

    @Override
    protected void takeItems() {
        System.out.println(name + " bring homework");
    }
}
