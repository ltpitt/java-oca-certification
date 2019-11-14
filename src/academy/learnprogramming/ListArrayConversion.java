package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        Object[] namesArray = names.toArray();
        System.out.println(namesArray.length);

        String[] stringArray = names.toArray(new String[0]);

        String[] anotherStringArray = names.toArray(new String[names.size()]);

        String[] petsArray = {"dog", "cat", "parrot"};
//        List<String> petsList = Arrays.asList(petsArray);
        List<String> petsList = Arrays.asList(petsArray); // returns fixed size list
        System.out.println(petsList.size());

        petsList.set(0, "bird");
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        petsArray[0] = "husky";
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

//        petsList.add("newDog");
//        petsList.remove(1);

        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list);
//        list.add("four");
    }
}
