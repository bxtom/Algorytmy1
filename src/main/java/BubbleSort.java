import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    private static int[] bubbleSort(int[] array) {
        if (array.length > 1) {
            boolean isOrderChanged = true;

            while (isOrderChanged) {
                isOrderChanged = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        isOrderChanged = true;
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

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
