package sort_array;

import static java.lang.System.nanoTime;

public class BubbleSort {
    public static void main(String[] args) {
        int[] randomNumber = new int[200];
        RandomElement.createArrayRandomNumber(randomNumber);
        System.out.println("Print out random elements:");
        for (int number : randomNumber) {

            System.out.println(number);
        }
        System.out.println("\n");
        long beginBubbleSort = nanoTime();
        getBubbleSortArray(randomNumber);
        long finishBubbleSort = nanoTime();
        long countTimeBubbleSort = finishBubbleSort - beginBubbleSort;
        System.out.println("The sorting process took: " + countTimeBubbleSort + " nanoseconds");
        System.out.println("\n");
        System.out.println("Print out sort elements: ");
        for (int sortNumber : randomNumber) {
            System.out.println(sortNumber);
        }
    }

    public static void getBubbleSortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[i]) {
                    int randomNumber = array[j];
                    array[j] = array[i];
                    array[i] = randomNumber;
                }
            }
        }
    }
}