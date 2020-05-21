package academy.learnprogramming.Questions;

import java.util.Arrays;

public class Question_32 {

    public static void main(String[] args) {
        int i = 4;
        int ia[][][] = new int[i][i = 3][i];
        int ia2[][][] = new int[3][1][10];

        System.out.println(ia.length + ", " + ia[0].length + ", " + ia[0][0].length);

        System.out.println(Arrays.deepToString(ia));

        System.out.println(Arrays.deepToString(ia2));


    }

}
