package academy.learnprogramming;


public class Husky extends Dog {

    public Husky(int age) {
//        this();
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Husky eating");

        super.eat();
    }

    @Override
    public int getWeight() {
        return 30;
    }

    @Override
    protected void printName() {
        System.out.println("Husky name= " + getName());
    }
}
