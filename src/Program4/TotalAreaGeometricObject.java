package Program4;

import Program1.Circle;
import Program1.GeometricObject;
import Program1.Rectangle;

import java.util.ArrayList;

public class TotalAreaGeometricObject {
    public static void main(String[] args) {
        ArrayList<GeometricObject> shapes = new ArrayList<GeometricObject>();
        Circle c1 = new Circle("green",false,20);
        Circle c2 = new Circle("green",false,10);
        Rectangle r1 = new Rectangle("red", true,5,4);
        Rectangle r2 = new Rectangle("red", true,5,10);
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(r2);
        System.out.println(shapes);
        System.out.printf("the total area of all the geometric objects is: %.2f",getTotalArea(shapes));
        /**[created on Tue Mar 06 10:01:02 EST 2018
         color: green and filled: false, created on Tue Mar 06 10:01:02 EST 2018
         color: green and filled: false, created on Tue Mar 06 10:01:02 EST 2018
         color: red and filled: true, created on Tue Mar 06 10:01:02 EST 2018
         color: red and filled: true]
         the total area of all the geometric objects is: 1640.80**/
    }
    public static double getTotalArea(ArrayList<GeometricObject> shapes){
        double total = 0;
        for (int i = 0; i<shapes.size();i++){
            total+=shapes.get(i).getArea();
        }
        return total;
    }
}
