package Program2;

import java.util.ArrayList;

public class ArrayFunctions {





    public static void sortArray(ArrayList<Number> array) {
        {
            for (int i = 0; i < array.size() - 1; i++) {
                Number min = array.get(i);
                int index = i;

                for (int j = i + 1; j < array.size(); j++) {
                    if (array.get(j).doubleValue() < min.doubleValue()) {
                        min = array.get(j);
                        index = j;
                    }
                }

                if (index != i) {
                    array.set(index, array.get(i));
                    array.set(i, min.intValue());
                }
            }
        }
    }



    public static void shuffleArray(ArrayList<Number> array){
        for (int i = 0; i < array.size(); i++) {

            int j = (int)(Math.random()
                    * (i + 1));

            int temp = array.get(i).intValue();
            array.set(i,array.get(j));
            array.set(j, temp);
        }
    }
}
