package patterns.behavior.visitor;

public class Main {
    public static void main(String[] args) {
        A a =  new A() ;
        B b = new B() ;
        a.act1();
        a.act2(b);
    }
}
