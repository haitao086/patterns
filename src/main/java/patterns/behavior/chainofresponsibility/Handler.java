package patterns.behavior.chainofresponsibility;



public abstract class Handler {
    String name ;

    Handler(String name ) {
        this.name = name ;
    }

    protected Handler successor ;
    public abstract void handleRequst() ;
    public Handler getSuccessor() {
        return successor;
    }
    public void setSuccessor(Handler successor) {
        this.successor = successor ;
    }
}
