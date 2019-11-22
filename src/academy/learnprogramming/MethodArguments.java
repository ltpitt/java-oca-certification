package academy.learnprogramming;

public class MethodArguments {

    int getZero() { // 0 arguments (niladic)
        return 0;
    }

    int increment(int number) { // 1 argument (monadic)
        return number + 1;
    }

    int sum(int a, int b) { // 2 arguments (dyadic)
        return a + b;
    }

    int plusMinus(int a, int b, int c) { // 3 arguments (triadic)
        return a + b - c;
    }

    double average(double a, double b, double c, double d) { // 4 arguments (polyadic)
        return (a + b + c + d) / 4.0;
    }

//    void test {} // does not compile no brackets

//    void test(int a; int b) {} // does not compile

    void test(int a, int b) {
    }

//    void test2(int a); // missing method body, does not compile
}
