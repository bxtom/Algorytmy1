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

    public static Edge2[] genaerateEdge2Array(int n) {
        Edge[] e = generateEdgeArray(n);
        Edge2[] result = new Edge2[e.length];
        for (int i = 0; i < e.length; i++) {
            Edge2 item = new Edge2(e[i].getA(), e[i].getB(), false);
            result[i] = item;
        }
    }
}
