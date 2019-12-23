package academy.learnprogramming;


public interface Carnivore {

    default void eatMeat() {
        System.out.println("Eating meat");
    }
}
