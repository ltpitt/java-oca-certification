package academy.learnprogramming.Questions;

public class Question_31 {

    public static void printSum(byte a, byte b) {
        System.out.println("In byte " + (a + b));
    }

    public static void printSum(short a, short b) {
        System.out.println("In short " + (a + b));
    }

    public static void printSum(char a, char b) {
        System.out.println("In char " + (a + b));
    }

    public static void printSum(int a, int b) {
        System.out.println("In int " + (a + b));
    }

    public static void printSum(float a, float b) {
        System.out.println("In float " + (a + b));
    }

    public static void printSum(long a, long b) {
        System.out.println("In long " + (a + b));
    }

    public static void printSum(double a, double b) {
        System.out.println("In double " + (a + b));
    }


    public static void main(String[] args) {

        boolean someBoolean = false;
        byte someByte = 1;
        short someShort = 1;
        char someChar = 'a';
        int someInt = 1;
        float someFloat = 2f;
        long someLong = 1L;
        double someDouble = 2.0;

        System.out.println("\nByte:");

        printSum(someByte, someByte);
        printSum(someByte, someShort);
        printSum(someByte, someChar);
        printSum(someByte, someInt);
        printSum(someByte, someFloat);
        printSum(someByte, someLong);
        printSum(someByte, someDouble);

        System.out.println("\nShort:");

        printSum(someShort, someByte);
        printSum(someShort, someShort);
        printSum(someShort, someChar);
        printSum(someShort, someInt);
        printSum(someShort, someFloat);
        printSum(someShort, someLong);
        printSum(someShort, someDouble);

        System.out.println("\nChar:");

        printSum(someChar, someByte);
        printSum(someChar, someShort);
        printSum(someChar, someChar);
        printSum(someChar, someInt);
        printSum(someChar, someFloat);
        printSum(someChar, someLong);
        printSum(someChar, someDouble);

        System.out.println("\nInt:");

        printSum(someInt, someByte);
        printSum(someInt, someShort);
        printSum(someInt, someChar);
        printSum(someInt, someInt);
        printSum(someInt, someFloat);
        printSum(someInt, someLong);
        printSum(someInt, someDouble);

        System.out.println("\nFloat:");

        printSum(someFloat, someByte);
        printSum(someFloat, someShort);
        printSum(someFloat, someChar);
        printSum(someFloat, someInt);
        printSum(someFloat, someFloat);
        printSum(someFloat, someLong);
        printSum(someFloat, someDouble);

        System.out.println("\nLong:");

        printSum(someLong, someByte);
        printSum(someLong, someShort);
        printSum(someLong, someChar);
        printSum(someLong, someInt);
        printSum(someLong, someFloat);
        printSum(someLong, someLong);
        printSum(someLong, someDouble);

        System.out.println("\nDouble:");

        printSum(someDouble, someByte);
        printSum(someDouble, someShort);
        printSum(someDouble, someChar);
        printSum(someDouble, someInt);
        printSum(someDouble, someFloat);
        printSum(someDouble, someLong);
        printSum(someDouble, someDouble);

    }

}
