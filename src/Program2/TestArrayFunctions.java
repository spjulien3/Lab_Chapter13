package Program2;

import java.util.ArrayList;

public class TestArrayFunctions {
    public static void main(String[] args) {
        ArrayList<Number> array = new ArrayList<Number>();
            array.add(1);
            array.add(32);
            array.add(12);
            array.add(40);
            array.add(5);
        //normal print order [1, 32, 12, 40, 5]
        System.out.println(array);
        ArrayFunctions.sortArray(array);
        //sorted print [1, 5, 12, 32, 40]
        System.out.println(array);
        ArrayFunctions.shuffleArray(array);
        //shuffled print random order will print
        System.out.println(array);


    }
}
