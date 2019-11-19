package academy.learnprogramming;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(createArray());

        // for loop
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
        }

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for loop totalTime= " + totalTime + " ms");

        // for each
        startTime = System.currentTimeMillis();

//        String str;
//        for(Iterator<String> iterator = list.iterator(); iterator.hasNext(); str = iterator.next()) {}

        for (String temp : list) {
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for each loop totalTime= " + totalTime + " ms");

        // iterator
        startTime = System.currentTimeMillis();

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String temp = iterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("iterator totalTime= " + totalTime + " ms");

        // listIterator
        startTime = System.currentTimeMillis();

        for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); ) {
            String temp = listIterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("listIterator totalTime= " + totalTime + " ms");
    }


    private static String[] createArray() {
        String[] stringArray = new String[10_000];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "Array " + i;
        }

        return stringArray;
    }
}
