package academy.learnprogramming;

public class NumericPromotion {

    public static void main(String[] args) {
        // promotion is converting "smaller" to "bigger" type
        int x = 5;
        double y = 10.55;

//        System.out.println("x + y = " + x + y );
//        double result = x + y;
        System.out.println("x + y = " + (x + y));

        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result = b + c + d;

        System.out.println("result= " + result);

        // casting is converting "bigger" type to "smaller" type

        double myDouble = 5.55;
        int myInt = 4 + (int) myDouble;
        System.out.println("result= " + myInt);

        int anotherInt = 125;
        byte myByte = 15;

        int intResult = anotherInt + myByte;
        byte byteResult = (byte) (anotherInt + myByte);

        System.out.println("intResult= " + intResult);
        System.out.println("byteResult= " + byteResult); // overflow
    }
}
