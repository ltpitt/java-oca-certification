package academy.learnprogramming;

import academy.learnprogramming.common.Common;

public class UsingAccessModifiers {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
//        common.protectedPrint();
//        common.defaultPrint();
//        common.privatePrint();

        System.out.println("publicNumber= " + common.publicNumber);
//        System.out.println("protectedNumber= " + common.protectedNumber);
//        System.out.println("defaultNumber= " + common.defaultNumber);
//        System.out.println("privateNumber= " + common.privateNumber);
    }
}
