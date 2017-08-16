import java.util.Random;

public class InsertionSort {
    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                for (int j = i; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        printArray(array);
        printArray(insertionSort(array));
    }
}
