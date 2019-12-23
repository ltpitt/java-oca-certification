package academy.learnprogramming;


public interface Walk {

    default int getSpeed() {
        return 5;
    }
}
