public class CountOccurrences {
    private static int countOccurrences(int[] array, int number) {
        int result = 0;

        for (int element: array) {
            if (element == number) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {17,24, 13, 77, 88, 11, 55, 13, 3};
        System.out.println(countOccurrences(array, 13));
    }
}
