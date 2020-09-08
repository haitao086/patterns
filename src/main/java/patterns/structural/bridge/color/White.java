package patterns.structural.bridge.color;

import patterns.structural.bridge.IColor;

public class White implements IColor {
    @Override
    public void bepaint(String shape) {
        System.out.println("White " + shape);
    }
}
