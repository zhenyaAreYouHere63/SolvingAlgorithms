package sort_array;

import java.util.Random;

public class RandomElement {
    public static void createArrayRandomNumber(int[] array) {
        Random randNum = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(200);
        }
    }
}