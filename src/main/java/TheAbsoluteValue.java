import java.util.Scanner;

public class TheAbsoluteValue {

    private static int getAbsoluteValue(int number) {
        if (number > 0) {
            return number;
        } else {
            return -number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x");
        int x = scanner.nextInt();
        System.out.println("Wartosc bezwzgledna: " + getAbsoluteValue(x));
    }
}
