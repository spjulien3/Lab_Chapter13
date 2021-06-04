package Program1;

import javafx.scene.paint.Color;

public class Triangle extends GeometricObject {
    private double sideA=1;
    private double sideB=1;
    private double sideC=1;

    public Triangle(String color, boolean filled, double sideA, double sideB, double sideC) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (getPerimeter()) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter(){
        return sideA+sideB+sideC;
    }

    @Override
    public String toString(){
        return String.format("Color: %-10s\nTriangle is filled: %-10b\nArea: %-10.2f\nPerimeter: %-10.2f",getColor(),isFilled(),getArea(),getPerimeter());
    }

}
