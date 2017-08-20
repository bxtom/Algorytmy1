package Graphs;

public class GraphGnp {
    public static boolean[][] generateGnp(int numberOfVertices, double probability) {
        boolean[][] result = new boolean[numberOfVertices][numberOfVertices];

        for (int i = 0; i < numberOfVertices -1; i++) {
            for (int j = i + 1; j < numberOfVertices; j++) {
                if (Math.random() < probability) {
                    result[i][j] = true;
                    result[j][i] = true;
                }
            }
        }

        return result;
    }
}
