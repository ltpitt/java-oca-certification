package academy.learnprogramming;

public class Vowel {

    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';
        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);


        int num[][] = new int[1][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
            }
        }

        System.out.println(num[0][0]);
        System.out.println(num[1][0]);
        System.out.println(num[2][0]);

    }


}