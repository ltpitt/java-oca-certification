package academy.learnprogramming;

class Example {
    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    private String name = "dog";

    {
        System.out.println(name);
    }

    {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Example() {
        System.out.println("constructor");
    }
}

class Demo {

    static {
        add(2);
    }

    static {
        add(4);
    }

    static {
        new Demo();
    }

    {
        add(6);
    }

    {
        add(8);
    }

    Demo() {
        add(5);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }
}

public class OrderOfInitialization {

    public static void main(String[] args) {
        new Example();
        new Demo();
    }
}
