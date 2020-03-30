package academy.learnprogramming.Questions;

public class Question_17 {

    int x, y;
//    public Test(int x, int y) {
//        initialize(x, y)
//    }

    public static void main(String[] args) {
        int x = 9, y = 5;
        // Does not compile, error in Constructor
        //Test obj = new Test(x, y);

    }

    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

}
