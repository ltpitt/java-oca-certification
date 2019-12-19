package main;

import academy.learnprogramming.*;


public class Main {

    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.setName("Rex");
        husky.printDetails();
        husky.setAge(6);
//        husky.printName();
        husky.printDetails();
        husky.run(10);
        System.out.println("tail length= " + husky.getTailLength());
        System.out.println("weight= " + husky.getWeight());

//        Dog dog = new Dog(3);
//        dog.setName("Rex");
//        dog.printDetails();

        husky.eat();
        System.out.println("avg= " + husky.getAverageWeight());


        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(10);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetails();

        Rabbit rabbit = new Rabbit();
        rabbit.eatPlants();
        rabbit.printDetails();

        Cat cat = new Cat(3);
        int speed = cat.getSpeed();
        System.out.println("cat speed is= " + speed);
    }
}
