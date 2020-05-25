package academy.learnprogramming.Questions;

public class Question_36 {
}

class DatabaseWrapper {
    static String url = "jdbc://derby://localhost:1527//mydb";

    static DatabaseWrapper getDatabase() {
        System.out.println("Getting DB");
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getDatabase().url);
    }
}
