package Graphs;

public class Triangles {
    public static int getGraphTrianglesCounter(boolean[][] a, int n) {
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j]) {
                    for (int k = i + 1; k < n; k++) {
                        if(a[i][k] && a[j][k]) {
                            result++;
                        }
                    }
                }
            }
        }

        return result;
    }
}
