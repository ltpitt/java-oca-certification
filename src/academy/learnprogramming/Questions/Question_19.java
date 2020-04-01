package academy.learnprogramming.Questions;

public class Question_19 {
}

class A {
    public void test() {
        System.out.println("A ");
    }
}

class B extends A {
    public void test() {
        System.out.println("B ");
    }
}

class C extends A {
    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();
        A b3 = (B) b2;
        b1 = (A) b2;
        b1.test();
        b2.test();
    }

    public void test() {
        System.out.println("C ");
    }
}
