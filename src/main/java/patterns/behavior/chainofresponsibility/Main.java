package patterns.behavior.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler("Annie") ;
        Handler h2 = new ConcreteHandler("Betty") ;
        h1.setSuccessor(h2 );
        h1.handleRequst();
    }
}
