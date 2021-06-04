package Program1;

import javafx.scene.paint.Color;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        double x= Math.PI * radius * radius;
        return x;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
