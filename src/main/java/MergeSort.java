import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    private static int[] mergeSort(int[] inputArray) {
        if (inputArray.length <= 1)
            return inputArray;

        int sizeOfLeftArray = inputArray.length / 2;
        int sizeOfRightArray = inputArray.length - sizeOfLeftArray;

        int inputArrayIndex = 0;

        int[] leftArray = new int[sizeOfLeftArray];
        for (int i = 0; i < sizeOfLeftArray; i++) {
            leftArray[i] = inputArray[inputArrayIndex];
            inputArrayIndex++;
        }

        int[] rightArray = new int[sizeOfRightArray];
        for (int i = 0; i < sizeOfRightArray; i++) {
            rightArray[i] = inputArray[inputArrayIndex];
            inputArrayIndex++;
        }

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        return merge(leftArray, rightArray);
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {
        int[] result = new int[leftArray.length + rightArray.length];

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        int resultArrayIndex = 0;

        while ((leftArrayIndex < leftArray.length) && (rightArrayIndex < rightArray.length)) {
            if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
                result[resultArrayIndex] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                result[resultArrayIndex] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
            resultArrayIndex++;
        }

        while (leftArrayIndex < leftArray.length) {
            result[resultArrayIndex] = leftArray[leftArrayIndex];
            leftArrayIndex++;
            resultArrayIndex++;
        }

        while (rightArrayIndex < rightArray.length) {
            result[resultArrayIndex] = rightArray[rightArrayIndex];
            rightArrayIndex++;
            resultArrayIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mergeSort(array)));
    }
}
