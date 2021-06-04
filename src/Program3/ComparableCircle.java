package Program3;

import Program1.Circle;
import Program1.GeometricObject;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public  ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public int compareTo(ComparableCircle c1){
        double circle = this.getArea();
        double circle2 = c1.getArea();
        if(circle>circle2){
            System.out.println("first Circle has a larger Area");
        }
        else if(circle<circle2){
            System.out.println("Second Circle has a larger Area");
        }
        else if(circle==circle2){
            System.out.println("Circles are equal");
        }
        else{
            System.out.println("There was an error");
        }
        return 0;
    }
}
