package patterns.structural.bridge.shape;

public class Square extends Shape {
    @Override
    public void draw() {
        color.bepaint("Square");
    }
}
