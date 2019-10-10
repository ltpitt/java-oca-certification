package academy.learnprogramming;

public class RelationalOperators {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 10;


        System.out.println("x < y :" + (x < y));
        System.out.println("x <= y :" + (x <= y));
        System.out.println("x >= z :" + (x >= z));
        System.out.println("x > z :" + (x > z));

        int a = 10;
        long b = 5L;
        double c = 7.5;

        System.out.println("a < b :" + (a < b));
        System.out.println("a > c :" + (a > c));

        int d = 12;
        long e = 15L;
        double f = 14.5;

        System.out.println((d < e) + " " + (e > f));
    }
}
