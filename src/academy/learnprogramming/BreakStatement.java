package academy.learnprogramming;

public class BreakStatement {

    public static void main(String[] args) {
//        myLabel:
//        int[] myArray = {1, 2, 3};

        myLabel:
        {
            int[] myArray = {1, 2, 3};
        }

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for (String animal : animals) {
            System.out.println(animal);
        }

        MY_LOOP:
        for (String animal : animals) {
            if (animal.equals("Cat")) {
                break MY_LOOP;
            }

            System.out.println(animal);
        }

        animal:
        for (String animal : animals) {
            if (animal.equals("Cat")) {
                break animal;
            }

            System.out.println(animal);
        }

        for (String animal : animals) {
            if (animal.equals("Lizard")) {
                break;
            }

            System.out.println(animal);
        }


        int index = 0;
        while (index < animals.length) {
            String animal = animals[index];

            if (animal.equals("Lizard")) {
                break;
            }

            System.out.println(animal);
            index++;
        }
    }
}
