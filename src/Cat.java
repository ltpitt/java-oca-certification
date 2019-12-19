import academy.learnprogramming.Animal;
import academy.learnprogramming.Run;


public class Cat extends Animal implements Run {

    public Cat(int age) {
        super(age);
    }

    @Override
    public int getWeight() {
        return 5;
    }

    @Override
    public void printName() {

    }

//    @Override
//    public int getSpeed() {
//        return 15;
//    }
}
