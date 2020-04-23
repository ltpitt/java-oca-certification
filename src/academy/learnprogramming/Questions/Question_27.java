package academy.learnprogramming.Questions;

public class Question_27 {
}

class A25 {
    public void test() {
        System.out.println("A");
    }
}

class B25 extends A25 {
    public void test() {
        System.out.println("B");
    }
}

class C25 extends A25 {
    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();

        b1 = (A) b2;
        A b3 = (B) b2;

        b1.test();
        b3.test();

    }

    public void test() {
        System.out.println("C");
    }

}