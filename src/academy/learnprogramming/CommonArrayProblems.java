package academy.learnprogramming;

public class CommonArrayProblems {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // 5 elements, index range 0-4

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i + " - " + numbers[i]);
        }

        for (int i = 1; i <= numbers.length - 1; i++) {
            System.out.println(i + " - " + numbers[i]);
        }

//        int[20] nums;
        int[] nums = new int[20]; // size only at initialization


//        int size = numbers.length(); // does not compile length is not a method
        int size = numbers.length;

//        numbers.length = 10; // does not compile you cant set length of array, only on initialization
    }
}
