public class ArrayMaxMin {
    private static int min(int[] array) {

        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }

        return result;
    }

    private static int max(int[] array) {

        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {17,24, 13, 77, 88, 11, 55, 7, 3};

        System.out.println("Minimalny element: " + min(array));
        System.out.println("Maxymalny element: " + max(array));
    }
}
