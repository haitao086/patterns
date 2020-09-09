package patterns.behavior.visitor;

public class B {
    public void showA(A a ) {
        System.out.println("--------B start--------");
        a.act1();
        System.out.println("--------B  end --------");
    }
}
