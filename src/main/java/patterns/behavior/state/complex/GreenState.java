package patterns.behavior.state.complex;

public class GreenState extends State{


    @Override
    public void handlepush(Context c) {
        System.out.println("change to black");
        c.setState(new BlackState());
    }

    @Override
    public void handlepull(Context c) {
        System.out.println("change to blue");
        c.setState(new BlueState());
    }

    @Override
    public Color getcolor() {
        return Color.green;
    }
}
