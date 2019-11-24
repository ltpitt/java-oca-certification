package academy.learnprogramming;

public class Launcher {

    public static void main(String[] args) {
        StaticMethodsAndFields.main(args);
        System.out.println(StaticMethodsAndFields.myNumber);

        AnotherMain.main(args);
    }
}
