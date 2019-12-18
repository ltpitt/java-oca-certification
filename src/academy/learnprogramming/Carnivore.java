package academy.learnprogramming;

/**
 * @author goran on 15/07/2017.
 */
public interface Carnivore {

    default void eatMeat() {
        System.out.println("Eating meat");
    }
}
