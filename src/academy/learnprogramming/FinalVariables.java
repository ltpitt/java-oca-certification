package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {

    private static final int SIZE = 10;

    private static final List<String> VALUES = new ArrayList<>();

    public static void main(String[] args) {
        int[] myArray = new int[SIZE];

//        SIZE = 11;
//        SIZE++;
        int doubleSize = 2 * SIZE;

        for (int i = 0; i < SIZE; i++) {
            System.out.println(myArray[i]);
        }

        VALUES.add("changed");
//        VALUES = new ArrayList<>();

        final int myNumber = 10;
//        myNumber = 11; // does not compile
    }
}
