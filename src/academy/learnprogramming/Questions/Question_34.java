package academy.learnprogramming.Questions;

import java.util.Arrays;

public class Question_34 {

    public static void main(String[] args) {

        int[] a[] = new int[5][4];
        System.out.println(Arrays.deepToString(a));

        int b[][] = new int[5][4];
        System.out.println(Arrays.deepToString(b));

        // Does not compile.
        // Arrays dimensions are written from left to right
//        int c[][] = new int [][4];
//        System.out.println(Arrays.deepToString(c));

        int[] d[] = new int[5][4];
        System.out.println(Arrays.deepToString(d));

        int[] e[] = new int[5][4];
        System.out.println(Arrays.deepToString(e));


    }


}
