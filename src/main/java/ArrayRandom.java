import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
    private static int[] arrayRandom(int[] array, int k) {
        int[] result = new int[k];
        int index = array.length-1;
        Random random = new Random();
        int r;

        while (k > 0) {
            r = random.nextInt(index);
//            int temp = array[r];
//            array[r] = array[index];
//            array[index] = temp;

            result[k-1] = array[r];
            array[r] = array[index];
            index--;
            k--;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int size = scanner.nextInt();
        System.out.println("Podaj liczbe losowan:");
        int k = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element nr " + i);
            array[i] = scanner.nextInt();
        }

        int[] output = arrayRandom(array, k);

        for (int element: output) {
            System.out.print(element + " ");
        }

    }
}