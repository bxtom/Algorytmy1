import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class BucketSort {


    private static String printSortedCashArray(int[] array, Map<Integer, Integer> cashMap) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                result.append(cashMap.get(i)).append(", ");
            }
        }

        return "[" + result.toString() + "]";
    }

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

    private static int[] bucketSortCash(int[] array) {
        int[] buckets = new int[9];

        //IntStream.of(array).forEach(valueFromInputArray -> buckets[valueFromInputArray.]++);

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


        // cash

        int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500};

        int[] cashArray = new int[100];
        for (int i = 0; i < cashArray.length; i++) {
            cashArray[i] = denominations[random.nextInt(denominations.length)];
        }

        System.out.println("");
        System.out.println(Arrays.toString(cashArray));

        int[] cashBuckets = new int[denominations.length];

        Map<Integer, Integer> cashMap = new HashMap<>();

        for (int i = 0; i < denominations.length; i++) {
            cashMap.put(denominations[i], i);
        }

        for (int cash : cashArray) {
            cashBuckets[cashMap.get(cash)]++;
        }

        System.out.println(Arrays.toString(cashBuckets));

        int index = 0;

//        for (int i = 0; i < cashBuckets.length; i++) {
//            for (int j = 0; j < cashBuckets[i]; j++) {
//
//                sult.append(cashMap.get(i)).append(", ");
//            }
//        }


//        System.out.println(printSortedCashArray(bucketSort(array), cashMap));
    }
}
