package sort_array;

import static java.lang.System.nanoTime;

public class BubbleSort {
    public static void main(String[] args) {
        int[] randomNumbers = new int[200];
        RandomNumber.createArrayRandomNumbers(randomNumbers);
        System.out.println("Print out random numbers:");
        for (int number : randomNumbers) {

            System.out.println(number);
        }
        System.out.println("\n");
        long beginBubbleSort = nanoTime();
        int[] sortNumbers = getBubbleSort(randomNumbers);
        long finishBubbleSort = nanoTime();
        long countTimeBubbleSort = finishBubbleSort - beginBubbleSort;
        System.out.println("The sorting process took: " + countTimeBubbleSort + " nanoseconds");
        System.out.println("\n");
        System.out.println("Print out sort numbers:");
        for (int sortNumber : sortNumbers) {
            System.out.println(sortNumber);
        }
    }

    public static int[] getBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[i]) {
                    int randomNumber = array[j];
                    array[j] = array[i];
                    array[i] = randomNumber;
                }
            }
        }
        return array;
    }
}