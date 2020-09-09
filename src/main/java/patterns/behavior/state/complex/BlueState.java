package patterns.behavior.state.complex;

public class BlueState extends State{


    @Override
    public void handlepush(Context c) {
        System.out.println("change to green");
        c.setState(new GreenState());
    }

    @Override
    public void handlepull(Context c) {
        System.out.println("change to red");
        c.setState(new RedState());
    }

    @Override
    public Color getcolor() {
        return Color.blue;
    }
}
