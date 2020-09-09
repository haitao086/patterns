package patterns.behavior.state.complex;

public class RedState extends State{


    @Override
    public void handlepush(Context c) {
        System.out.println("change to blue");
        c.setState(new BlueState());
    }

    @Override
    public void handlepull(Context c) {
        System.out.println("change to black");
        c.setState(new BlackState());
    }

    @Override
    public Color getcolor() {
        return Color.red;
    }
}
