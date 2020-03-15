package academy.learnprogramming;

public class Natural {

    private int i;

    public static void main(String[] args) {
        new Natural().disp();

        int iArray[] = {65, 68, 69};
        iArray[2] = iArray[0];
        iArray[0] = iArray[1];
        iArray[1] = iArray[2];
        for (int element : iArray) {
            System.out.print(element + " ");
        }

    }

    void disp() {
        while (i <= 5) {
            for (int i = 1; i <= 5; ) {
                System.out.print(i + " ");
                i++;
            }
            i++;
        }
    }
}