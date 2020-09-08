package patterns.structural.bridge.shape;

import patterns.structural.bridge.IColor;

public abstract class Shape {
    IColor color;

    public void setColor(IColor color) {
        this.color = color;
    }

    public abstract void draw();
}
