package Graphs;

public class Structures {
    public static Edge[] generateEdgeArray(int n) {
        int h = n * (n - 1) / 2;
        Edge[] result = new Edge[h];

        int index = 0;
        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j < n; j++) {
                Edge newEdge = new Edge(i, j);
                result[index] = newEdge;
                index++;
            }
        }

        return result;
    }
}
