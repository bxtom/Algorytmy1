import java.util.Scanner;

public class Factorial {

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number -1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scanner.nextInt();
        System.out.println("Silnia z " + n + ": " + factorial(n));
    }
}
