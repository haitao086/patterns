package patterns.structural.bridge.color;

import patterns.structural.bridge.IColor;

public class Black implements IColor {
    @Override
    public void bepaint(String shape) {
        System.out.println("Black " + shape);
    }
}
