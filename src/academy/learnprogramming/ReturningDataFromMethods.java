package academy.learnprogramming;

public class ReturningDataFromMethods {

    public static void main(String[] args) {
        int number = 2;
        String word = "xyz";

//        number(number);
        number = number(number); // 3

//        word = word(word); // xyza
        word(word);

        System.out.println(number + word); //2xyza
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String word(String word) {
        word += "a"; // xyza
        return word;
    }
}
