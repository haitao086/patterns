package patterns.behavior.state.complex;

public class BlackState extends State{


    @Override
    public void handlepush(Context c) {
        System.out.println("change to red");
        c.setState(new RedState());
    }

    @Override
    public void handlepull(Context c) {
        System.out.println("change to red");
        c.setState(new RedState());
    }

    @Override
    public Color getcolor() {
        return Color.black;
    }
}
