package sort_array;

import java.util.Random;

public class RandomNumber {
    public static void createArrayRandomNumbers(int[] array) {
        Random randNum = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(200);
        }
    }
}