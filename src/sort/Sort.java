package sort;

import java.util.Random;

import static java.lang.System.nanoTime;

public class Sort {

    public static void main(String[] args) {
        Method method = new Method();
        int[] array = new int[200];
        int[] randomNumbers = Sort.createArrayRandomNumbers(array);
        System.out.println("Print out random numbers: ");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
        System.out.println("\n");
        System.out.println("Print out sort numbers: ");
        long beginBubbleSort = nanoTime();
        method.bubbleSort(randomNumbers);
        long finishBubbleSort = nanoTime();
        System.out.println("The sorting process took: " + (finishBubbleSort - beginBubbleSort) + " nanoseconds");
    }

    public static int[] createArrayRandomNumbers(int[] array) {
        Random randNum = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(200);
        }
        return array;
    }
}