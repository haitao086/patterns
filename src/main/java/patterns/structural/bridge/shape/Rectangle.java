package patterns.structural.bridge.shape;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.bepaint("Rectangle");
    }
}
