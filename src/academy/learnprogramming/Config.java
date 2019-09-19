package academy.learnprogramming;

public class Config {
    public static final String NAME = "myName";
    public static final int MAX_COLUMN_COUNT = 5;

    public static void printConfig() {
        System.out.println("name= " + NAME + " columnCount= " + MAX_COLUMN_COUNT);
    }
}
