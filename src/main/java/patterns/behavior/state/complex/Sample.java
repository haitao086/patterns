package patterns.behavior.state.complex;

import patterns.behavior.state.complex.Color;

public class Sample {
    private  Color color ;
    public Sample(Color color) {
        this.color = color ;
    }
    public void operate() {
        System.out.println("Current state is " + color.toString());
    }
}

