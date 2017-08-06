import java.util.Scanner;

public class Euclid {
    private static int euclid(int a, int b) {

        do {
            if (a == b) {
                return a;
            } else {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
        }

        while (a != b);

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a");
        int a = scanner.nextInt();
        System.out.println("Podaj b");
        int b = scanner.nextInt();
        System.out.println("NWD = " + euclid(a, b));
    }
}
