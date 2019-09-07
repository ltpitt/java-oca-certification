package academy.learnprogramming;

public class Main {




    public static void main(String[] args){
        System.out.println("arg-size=" + args.length);

        for(int i = 0; i < args.length; i++) {
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
