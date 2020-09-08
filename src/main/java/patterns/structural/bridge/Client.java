package patterns.structural.bridge;

import patterns.structural.bridge.color.Black;
import patterns.structural.bridge.color.Gray;
import patterns.structural.bridge.color.White;
import patterns.structural.bridge.shape.Circle;
import patterns.structural.bridge.shape.Rectangle;
import patterns.structural.bridge.shape.Shape;
import patterns.structural.bridge.shape.Square;

public class Client {
    public static void main(String[] args) {
        //white
        IColor white = new White();
        IColor black = new Black();
        IColor gray = new Gray();
        //square
        Shape square = new Square();
        //White square
        square.setColor(white);
        square.draw();

        //rectangle
        Shape rectange = new Rectangle();
        rectange.setColor(black);
        rectange.draw();

        //Circle
        Shape circle = new Circle() ;
        circle.setColor(gray);
        circle.draw();
    }
}
