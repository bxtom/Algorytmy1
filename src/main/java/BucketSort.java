import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class BucketSort {

    private static String printSortedArray(int[] array) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                result.append(i).append(", ");
            }
        }

        return "[" + result.toString() + "]";
    }

    private static int[] bucketSort(int[] array) {
        int[] buckets = new int[5];

        IntStream.of(array).forEach(valueFromInputArray -> buckets[valueFromInputArray]++);

        return buckets;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(bucketSort(array)));
        System.out.println(printSortedArray(bucketSort(array)));
    }
}
