package Program1;

public class Rectangle extends GeometricObject {
    private double length;
    private double width;

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return (2*length)+(2*width);
    }

}
