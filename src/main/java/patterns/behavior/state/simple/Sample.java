package patterns.behavior.state.simple;

public class Sample {
    private  Color color ;
    public Sample(Color color) {
        this.color = color ;
    }
    public void operate() {
        System.out.println("Current state is " + color.toString());
    }
}
