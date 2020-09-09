package patterns.behavior.state.complex;


public class Main {
    public static void main(String[] args) {
        Context c = new Context() ;
        c.setState(new RedState());


        c.pull();
        c.push();
    }
}
