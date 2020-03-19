package academy.learnprogramming.Questions;

public class Question_10 {

    public static void main(String[] args) {

        // This code prints 2413

        int n[][] = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {
            for (int y : n[i]) {
                System.out.print(y);
            }
        }

    }


}
