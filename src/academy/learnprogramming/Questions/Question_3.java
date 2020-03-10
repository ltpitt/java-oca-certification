package academy.learnprogramming.Questions;

public class Question_3 {
}

class Test {
    static boolean isAvailable = false;

    public static void main(String[] args) {
        Test ts = new Test();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff() {
        return !isAvailable;
    }
}