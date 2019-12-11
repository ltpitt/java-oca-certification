package academy.learnprogramming.main;

import academy.learnprogramming.Dog;
import academy.learnprogramming.Husky;

/**
 * @author goran on 14/07/2017.
 */
public class Main {

    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();
    }
}
