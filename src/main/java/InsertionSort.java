import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                for (int j = i; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    } else break;
                }
            }
        }

        return array;
    }

    private static int[] insertionSortDamian(int[] array) {
        int[] result = new int[array.length];

        if (array.length > 0) {
            result[0] = array[0];
        }

        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                boolean added = false;

                for (int j = 0; j < result.length; j++) {
                    if (array[i] < result[j]) {
                        result = move(result, array[i], j);
                        added = true;
                        break;
                    }
                }

                if(added) {
                    result[i] = array[i];
                }
            }
        }

        return result;
    }

    private static int[] move(int[] array, int insertValue, int insertIndex) {
        for (int i = array.length - 1; i > insertIndex; i--) {
            array[i] = array[i-1];
        }

        array[insertIndex] = insertValue;

        return array;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(insertionSort(array)));
        System.out.println(Arrays.toString(insertionSortDamian(array)));
    }
}
