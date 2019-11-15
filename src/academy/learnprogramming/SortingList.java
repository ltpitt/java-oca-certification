package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

    public static void main(String[] args) {
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);
        Collections.sort(numsList);
        System.out.println(numsList);

        List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
