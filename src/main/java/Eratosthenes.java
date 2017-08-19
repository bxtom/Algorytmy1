import java.util.ArrayList;
import java.util.Arrays;

public class Eratosthenes {
    private static int[] sieveOfEratosthenes2(int[] array) {
        int sqrt = (int) Math.floor(Math.sqrt(array.length));
        for (int i = 0; i < array.length; i++) {
            int numberToCompare = array[i];
            if (numberToCompare != 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] % numberToCompare == 0) {
                        array[j] = 0;
                    }
                }
            }

            if (array[i] > sqrt) {
                break;
            }
        }

        return array;
    }


    private static ArrayList<Integer> sieveOfEratosthenes(ArrayList<Integer> arrayList) {
        for (int i = 0; i < Math.floor(Math.sqrt(arrayList.size())); i++) {
            int numberToCompare = arrayList.get(i);
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) % numberToCompare == 0) {
                    arrayList.remove(j);
                }
            }
        }

        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] array = new int[29];
        for (int i = 0; i < 29; i++) {
            arrayList.add(i + 2);
            array[i] = i + 2;
        }

        System.out.println(arrayList);
        System.out.println(sieveOfEratosthenes(arrayList));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sieveOfEratosthenes2(array)));
    }
}
