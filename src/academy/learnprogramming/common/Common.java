package academy.learnprogramming.common;

public class Common {

    public int publicNumber = 10;
    protected int protectedNumber = 20;
    int defaultNumber = 30;
    private int privateNumber = 40;

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        common.privatePrint();

        System.out.println("publicNumber= " + common.publicNumber);
        System.out.println("protectedNumber= " + common.protectedNumber);
        System.out.println("defaultNumber= " + common.defaultNumber);
        System.out.println("privateNumber= " + common.privateNumber);
    }

    public void publicPrint() {
        System.out.println("public");
    }

    protected void protectedPrint() {
        System.out.println("protected");
    }

    void defaultPrint() {
        System.out.println("default");
    }

    private void privatePrint() {
        System.out.println("private");
    }
}
