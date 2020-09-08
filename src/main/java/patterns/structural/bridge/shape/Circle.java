package patterns.structural.bridge.shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        color.bepaint("Circle");
    }
}
