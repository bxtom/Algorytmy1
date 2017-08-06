import java.util.Scanner;

public class Fibonacci {
    private static int fibonacci(int number) {
        if (number <= 2) {
            return 1;
        } else {
            return fibonacci(number -2) + fibonacci(number -1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scanner.nextInt();
        System.out.println("fibonacci z " + n + ": " + fibonacci(n));
    }
}
