package academy.learnprogramming;

public class OverloadingMethods {


    public static void run(int length) {
    }

    public static void run(Integer length) {
    }

    public static void run(double kilometers) {
    }

    public static void jump(String s) {
        System.out.println("string");
    }

    public static void jump(Object o) {
        System.out.println("object");
    }
//    public int walk(float km) {} // does not compile
//    public static void walk(float miles) {}

    public static void main(String[] args) {
        run(9L);
        jump("test");
        jump(25);

        sum(1, 2);
    }
//    public void walk(int... vars) {}

    //    public static long sum(long a, long b) {
//        System.out.println("long sum");
//        return a + b;
//    }
    public static int sum(int... numbers) {
        System.out.println("sum var args");

        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }

        return sum;
    }

    public void walk(int miles) {
    }

    public void walk(short feet) {
    }

    public boolean walk() {
        return false;
    }

    void walk(int miles, short feet) {
    }

    public void walk(float miles) {
    }

//    public static int sum(int a, int b) {
//        System.out.println("int sum");
//        return a + b;
//    }

    public void walk(int[] lengths) {
    }

//    public static Integer sum(Integer a, Integer b) {
//        System.out.println("integer sum");
//        return a + b;
//    }


}
