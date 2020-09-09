package patterns.behavior.state.simple;

public class Main {
    public static void main(String[] args) {
        Context c = new Context(Color.red) ;
        c.checkStatus();

        c.pull();
    }
}
