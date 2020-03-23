package academy.learnprogramming.Questions;

public class Question_12 {
}

class Fieldinit {
    char c;
    boolean b;
    float f;

    public static void main(String[] args) {
        Fieldinit f = new Fieldinit();
        f.printAll();
    }

    void printAll() {
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
    }

}
