package academy.learnprogramming.main;

import academy.learnprogramming.*;

import java.util.ArrayList;
import java.util.List;


public class Polymorphism {

    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Rex");

        Dog dog = husky; // another reference to Husky object in memory
        dog.printDetails();

        HasTail hasTail = husky; // another reference
        System.out.println("tailLength= " + hasTail.getTailLength());

        CanRun canRun = husky; // another reference
        canRun.run(5);

        Animal animal = husky; // another reference
        animal.printDetails();

        Object object = husky; // another reference

//        husky.printName();
        Husky myDog = (Husky) animal; // another reference
        myDog.printName();

        Animal cat = new Cat(2);
        Cat myCat = (Cat) cat;

//        Bear bear = (Bear)"test"; // not related in hierarchy

//        Dog newDog = (Dog)cat; // class cast exception

        // bird is not polymorphic
        Bird bird = new Bird();
        Object birdObject = bird;

        Eagle eagle = new Eagle();
        Bird eagleBird = eagle;
        Object eagleObject = eagle;

        List<String> list = new ArrayList<>();

        Animal rabbitAnimal = new Rabbit();
        rabbitAnimal.printDetails();
    }
}
