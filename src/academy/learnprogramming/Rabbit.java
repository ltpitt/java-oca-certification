package academy.learnprogramming;

public class Rabbit extends Animal {

    public Rabbit() {
//        super; // does not compile
//        super().setAge(3);

        super();
//        super.setAge(3);
//        this.setAge(3);
//        setAge(3);
    }

    public Rabbit(int age) {
//        this(age); recursive call

//        this();
//        super();
//        this();
//        setAge(3);
        super(3);
    }
}
