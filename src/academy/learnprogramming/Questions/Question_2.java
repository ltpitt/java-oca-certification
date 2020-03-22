package academy.learnprogramming.Questions;

public class Question_2 {
}

abstract class A3 {
    private static int i;

    public A3() {
    }

    public void doStuff() {
    }
}

final class A1 {
    public A1() {
    }
}

// Does not compile
//private class A2 {
//    private static int i;
//    private A2 () {}
//}

class A4 {
    protected static final int i = 10;

    private A4() {
    }
}

// Does not compile
//final abstract class A5 {
//
//}