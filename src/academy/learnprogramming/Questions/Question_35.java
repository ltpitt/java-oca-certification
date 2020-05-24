package academy.learnprogramming.Questions;

public class Question_35 {
}

class Game {
    public void play() throws Exception {
        System.out.println("Playing...");
    }
}

class Soccer extends Game {
    // Will not compile without throws Exception
    public static void main(String[] args) throws Exception {
        Game g = new Soccer();
        g.play();


    }

    public void play() {
        System.out.println("Playing Soccer...");
    }
}



