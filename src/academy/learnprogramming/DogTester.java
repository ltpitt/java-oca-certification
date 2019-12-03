package academy.learnprogramming;

public class DogTester {

    public static void main(String[] args) {
        AnotherDog husky = new AnotherDog();

        System.out.println(husky.count); // warning
        System.out.println(AnotherDog.count);

        AnotherDog anotherDog = new AnotherDog();
        anotherDog.incrementCounter(); // warning

        AnotherDog.incrementCounter();

        System.out.println(AnotherDog.count);

        husky = null;
        anotherDog = null;

        System.out.println(AnotherDog.count);
        System.out.println(husky.count);
        System.out.println(anotherDog.count);

        AnotherDog.count = 10;
        AnotherDog newDog = new AnotherDog();
        AnotherDog dog2 = new AnotherDog();
        newDog.count = 5;

        System.out.println(AnotherDog.count);
        System.out.println(newDog.count);
        System.out.println(dog2.count);

        dog2.count = 11;

        System.out.println(AnotherDog.count); // 11
        System.out.println(newDog.count);
        System.out.println(dog2.count);
    }
}
