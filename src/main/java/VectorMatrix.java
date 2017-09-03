import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class VectorMatrix {
    private static final int N = 10000;
    private static final int BOUND = 10;

    private static int[] multiply(int[][] matrix, int[] vector) {
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            innerLoop(matrix[i], vector, result, i);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    private static void innerLoop(int[] matrix, int[] vector, int[] result, int i) {
        for (int j = 0; j < N; j++) {
            result[i] += vector[j] * matrix[j];
        }
    }

    private static int[] multiplyUsingStreams(int[][] matrix, int[] vector) {
        return Arrays.stream(matrix)
                .mapToInt(row ->
                        IntStream.range(0, row.length)
                                .map(col -> row[col] * vector[col])
                                .sum()
                ).toArray();
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = random.nextInt(BOUND);
        }

        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = random.nextInt(BOUND);
            }
        }

        //System.out.println(Arrays.toString(vector));
        //System.out.println("");
        //Arrays.stream(matrix).forEach(array -> System.out.println(Arrays.toString(array)));
        //System.out.println("");
        //System.out.println(Arrays.toString(multiply(matrix, vector)));
        //System.out.println("");
        //System.out.println(Arrays.toString(multiplyUsingStreams(matrix, vector)));

        Arrays.toString(multiply(matrix, vector));
    }
}
