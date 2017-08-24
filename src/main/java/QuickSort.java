import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private static void quickSort(int[] array, int lo, int hi) {
        if (lo < hi) {
            int p = partition(array, lo, hi);
            quickSort(array, lo, p - 1);
            quickSort(array, p + 1, hi);
        }
    }

    private static int partition(int[] array, int lo, int hi) {
        int pivot = array[hi];
        int i = lo - 1;
        for (int j = lo; j < hi; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        if (array[hi] < array[i + 1]) {
            int temp = array[i + 1];
            array[i + 1] = array[hi];
            array[hi] = temp;
        }

        i++;

        return i;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
