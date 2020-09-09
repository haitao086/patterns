package patterns.behavior.visitor;

public class A {
    public void act1() {
        System.out.println("I am A");
    }
    public void act2(B b) {
        b.showA(this);
    }
}
