package academy.learnprogramming.Questions;

public class Question_30 {

    public static void main(String[] args) {
        Question_30 ex = new Question_30();
        int cardNo = 12344;
        // Compilation only fails at line 17 because of Unhandled Exception
        //ex.readCard(cardNo);
        ex.checkCard(cardNo);
    }

    void readCard(int cardNo) throws Exception {
        System.out.println("Reading card");
    }

    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("Checking Card");
    }

}
