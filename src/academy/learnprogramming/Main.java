package academy.learnprogramming;

/**
 *
 */
public class Main {


    /**
     * This is main method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // printing size of arguments
        //
        //
        System.out.println("args-size= " + args.length);


        /*
         * printing arguments
         * another line
         */
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }


    }

    /**
     * Calculates sum of two integers.
     *
     * @param a operand
     * @param b operand
     * @return sum
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
