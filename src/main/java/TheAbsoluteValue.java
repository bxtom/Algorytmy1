import java.util.Scanner;

public class TheAbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x");
        int x = scanner.nextInt();

        if (x > 0)
            System.out.println("Wartosc bezwzgledna: " + x);
        else
            System.out.println("Wartosc bezwzgledna: " + -x);
    }
}
