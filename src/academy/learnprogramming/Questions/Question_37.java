package academy.learnprogramming.Questions;

public class Question_37 {
}

class X {
    int val = 10;
}

class Y extends X {
    Y val = null; //1
}

class ssTestClass extends X {

    static char ch;
    static float f;
    static boolean bool;

    public static void main(String[] args) {
        System.out.print(f);
        System.out.print(" ");
        System.out.print(ch);
        System.out.print(" ");
        System.out.print(bool);
    }
}