package academy.learnprogramming.Questions;

import java.util.ArrayList;
import java.util.List;

public class Question_9 {

    public static void main(String[] args) {
        List colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3, "cyan");
        System.out.println(colors);
    }

}
