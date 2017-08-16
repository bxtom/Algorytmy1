import java.util.Random;

public class BubbleSort {
    private static void printArray(int[] array) {
        for (int number: array) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    private static void bubbleSort(int[] array) {
        boolean isOrderChanged = true;

        while (isOrderChanged) {
            isOrderChanged = false;
            for (int i = 0; i < array.length -1; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isOrderChanged = true;
                }
            }
        }

        printArray(array);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        printArray(array);
        bubbleSort(array);
    }
}
