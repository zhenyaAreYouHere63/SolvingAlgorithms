package sort_array;

public class InsertSort {

    public static void main(String[] args) {
        int[] randomNumbers = new int[200];
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.createArrayRandomNumbers(randomNumbers);
        System.out.println("Print out random numbers:");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
        System.out.println("\n");
        long beginInsertSort = System.nanoTime();
        int[] sortNumbers = getInsertSort(randomNumbers);
        long finishInsertSort = System.nanoTime();
        System.out.println("The sorting process took: " + (finishInsertSort - beginInsertSort) + " nanoseconds");
        System.out.println("\n");
        System.out.println("Print out sort numbers:");
        for (int number : sortNumbers) {
            System.out.println(number);
        }
    }

    public static int[] getInsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > number) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = number;
        }
        return array;
    }
}