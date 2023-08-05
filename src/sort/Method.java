package sort;

public class Method {

    public void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > number) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = number;
        }
        for (int number: array)
        {
            System.out.println(number);
        }
    }
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[i]) {
                    int number = array[j];
                    array[j] = array[i];
                    array[i] = number;
                }
            }
        }
        for (int number: array)
        {
            System.out.println(number);
        }
    }
}