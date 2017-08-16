import java.util.ArrayList;

public class Eratosthenes {
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
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 29; i++) {
            array.add(i + 2);
        }

        System.out.println(array);
        System.out.println(sieveOfEratosthenes(array));
    }
}
