package academy.learnprogramming.Questions;


public class Question_8 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");

        // String below allows to print Equal
        if (str2.equals(str1.toLowerCase())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

}
