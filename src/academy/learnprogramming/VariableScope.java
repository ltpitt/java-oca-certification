package academy.learnprogramming;

public class VariableScope {


    static int myNewInt = 5;

    public static void main(String[] args) {
        int myLocalInt = 10;

        {
            {
                int myOtherInt = 10;
                {
                    int myOtherInt2 = 20;
                }
            }
            int myOtherInt = 20;
            int anotherInt = 30;
            System.out.println("myOtherInt= " + myOtherInt);
            System.out.println("inCodeBlock myLocalInt= " + myLocalInt);
        }

//        System.out.println("myOtherInt= " + myOtherInt);
        System.out.println("myLocalInt= " + myLocalInt);
        System.out.println("myNewInt= " + myNewInt);

//        System.out.println("myOtherInt= " + myOtherInt); // does not compile

        int myOtherInt = 30;
        int anotherInt = 40;

        System.out.println("myOtherInt= " + myOtherInt);
        System.out.println("anotherInt= " + anotherInt);
    }

    public static void myMethod() {

    }
}
