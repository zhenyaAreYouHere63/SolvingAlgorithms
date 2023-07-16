package sort_array;

public class InsertSort {

    public static void main(String[] args) {
        int[] randomNumbers = new int[200];
        RandomElement.createArrayRandomNumber(randomNumbers);
        System.out.println("Print out random elements:");
        for (int randomNumber : randomNumbers) {
            System.out.println(randomNumber);
        }
        System.out.println("\n");
        long beginInsertSort = System.nanoTime();
        getInsertSortArray(randomNumbers);
        long finishInsertSort = System.nanoTime();
        long countTimeBubbleSort = finishInsertSort - beginInsertSort;
        System.out.println("The sorting process took: " + countTimeBubbleSort + " nanoseconds");
        System.out.println("\n");
        System.out.println("Print out sort elements: ");
        for (int sortNumber : randomNumbers) {
            System.out.println(sortNumber);
        }
    }

    public static void getInsertSortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > number) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = number;
        }
    }
}