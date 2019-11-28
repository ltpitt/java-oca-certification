package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {

    private static final int SIZE;
    private static final int two;
    private static final int three = 3;
    private static final List<String> NAMES = new ArrayList<>();
    private static int one;
//    private static final int four;

    static {
        System.out.println("first static init");
        int rows = 5;
        int columns = 4;
        SIZE = rows * columns;
    }

    static {
        System.out.println("third static init");
        NAMES.add("Jimmy");
        NAMES.add("Timmy");
    }


    static {
        System.out.println("second static init");
        one = 1;
        two = 2;
        one = three;
//        three = 3;
//        two = 6;
        one = 2;
        one = three;
    }


    public static void main(String[] args) {
        System.out.println(NAMES);
    }
}
