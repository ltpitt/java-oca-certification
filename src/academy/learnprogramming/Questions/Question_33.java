package academy.learnprogramming.Questions;

import java.io.IOException;

class PortConnector {

    public PortConnector(int port) throws Exception {
        if (Math.random() > 0.5) {
            throw new IOException();
        }

        throw new RuntimeException();
    }
}


public class Question_33 {

    public static void main(String[] args) {
        try {
            PortConnector pc = new PortConnector(10);
        } catch (Exception re) {
            re.printStackTrace();
        }
    }
}