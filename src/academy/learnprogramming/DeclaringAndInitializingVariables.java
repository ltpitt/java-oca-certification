package academy.learnprogramming;

public class DeclaringAndInitializingVariables {

    public static void main(String[] args) {
        // declaring and initializing in two lines
        int myNumber; // declaration
//        System.out.println("myNumber= " + myNumber);
        myNumber = 10; // initialization
        System.out.println("myNumber= " + myNumber);

        // one line
        double myDouble = 7.50;
        System.out.println("myDouble= " + myDouble);

        float myFloat1, myFloat2, myFloat3;
        float myFloat4;
        float myFloat5;

        float myFloat6 = 5f, myFloat7 = 10f, myFloat8;
        boolean b1, b2;

//        double d1, double d2; // does not compile

        int i1;
        int i2;
        // int i3; i4; // does not compile

//        int int = 10; // does not compile
        char cHaR;
        char Char;

        float okFloat;
        double $Ok2Double1;
        double _alsoDouble;
        float __OkButNotNice$_123;

        // illegal examples
        // double 3point;
        // double my@street;
//        float *$coffee;
//        float double;
//        double public;
    }
}

