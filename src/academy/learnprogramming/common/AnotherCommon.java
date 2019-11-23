package academy.learnprogramming.common;


public class AnotherCommon {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.defaultPrint();
        common.protectedPrint();
//        common.privatePrint();

        System.out.println("publicNumber= " + common.publicNumber);
        System.out.println("protectedNumber= " + common.protectedNumber);
        System.out.println("defaultNumber= " + common.defaultNumber);
//        System.out.println("privateNumber= " + common.privateNumber);
    }
}
