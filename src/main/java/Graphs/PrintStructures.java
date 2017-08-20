package Graphs;

import java.util.Arrays;

public class PrintStructures {
    public static void printA(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void printE(Edge[] e) {
        for (Edge item: e) {
            System.out.println(item);
        }
    }

}
