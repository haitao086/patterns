package patterns.behavior.chainofresponsibility;

public class ConcreteHandler extends Handler {
    ConcreteHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequst() {
        if (getSuccessor() != null) {
            System.out.println(name + " put the request over.");
            getSuccessor().handleRequst();
        } else {
            System.out.println(name + " handle request ");
        }
    }
}
