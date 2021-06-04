package Program3;

public class TestComparable {
    public static void main(String[] args) {
        ComparableCircle circle = new ComparableCircle("Blue", true, 5);
        ComparableCircle circle2 = new ComparableCircle("Red", false, 20);
        circle.compareTo(circle2);
//Prints: Second Circle has a larger Area

    }
}
