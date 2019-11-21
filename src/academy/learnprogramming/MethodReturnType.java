package academy.learnprogramming;

public class MethodReturnType {

    public void jump() {
    } // return type void

    public void jump2() { // return type void
        return; // return is redundant
    }

    public String jump3() {
        return "";
    } //

//    public String jump4() {} // does not compile, no return statement

//    public jump5() {}

    String jump6(int a) {
        if (a == 5) {
//            return "";
        }

        return "abc";
    }

    int getInt() {
        return 9;
    }

    int getLong() {
        return (int) 9L;
    }

    int expanded() {
//        int temp = 10;
//        return temp;
        return 10;
    }

    boolean isTrue() {
//        return 5 < 10;
        return 5 == 5;
    }

    public void test() {
    }
//    public void 2test() {}
//    public void public() {}

    public void $test() {
    }

    public void _test() {
    }

//    public void() {}
}
