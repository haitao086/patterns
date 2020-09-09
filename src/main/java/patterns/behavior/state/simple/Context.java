package patterns.behavior.state.simple;

public class Context {
    private Color state = null;

    public Context(Color color) {
        this.state = color ;
    }

    public void checkStatus(){
        Sample sample = new Sample(state);
        sample.operate();
    }

    public void push() {
        //if current state isred should change to blue
        if (state == Color.red) state = Color.blue;
        //if current state isblue should change to green
        else if (state == Color.blue) state = Color.green;
        //if current state isblack should change to red
        else if (state == Color.black) state = Color.red;
        //if current state isgreen should change to black
        else if (state == Color.green) state = Color.black;
        Sample sample = new Sample(state);
        sample.operate();
    }

    public void pull() {
        //reverse
        if (state == Color.green) state = Color.blue;
        else if (state == Color.black) state = Color.green;
        else if (state == Color.blue) state = Color.red;
        else if (state == Color.red) state = Color.black;
        Sample sample = new Sample(state);
        sample.operate();
    }

}
