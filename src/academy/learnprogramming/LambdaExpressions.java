package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

interface CheckAnimal {
    boolean check(LambdaAnimal animal);
}

interface AnotherCheck {
    boolean check(LambdaAnimal first, LambdaAnimal second);
}

class LambdaAnimal {
    private String type;
    private boolean canJump;
    private boolean canSwim;

    public LambdaAnimal(String type, boolean canJump, boolean canSwim) {
        this.type = type;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean canJump() {
        return canJump;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String getType() {
        return type;
    }
}

class CheckCanJump implements CheckAnimal {

    @Override
    public boolean check(LambdaAnimal animal) {
        return animal.canJump();
    }
}

public class LambdaExpressions {

    public static void main(String[] args) {
        List<LambdaAnimal> animals = new ArrayList<>();
        animals.add(new LambdaAnimal("fish", false, true));
        animals.add(new LambdaAnimal("rabbit", true, false));
        animals.add(new LambdaAnimal("dog", true, true));


        print(animals, new CheckCanJump());

        print(animals, animal -> animal.canSwim());
        print(animals, animal -> !animal.canSwim());

    }

    private static void print(LambdaAnimal first, LambdaAnimal second, AnotherCheck check) {
        System.out.println(check.check(first, second));
    }

    private static void print(List<LambdaAnimal> animals, CheckAnimal filter) {
        for (LambdaAnimal animal : animals) {
            if (filter.check(animal)) {
                System.out.println(animal.getType());
            }
        }

        System.out.println();
    }
}
