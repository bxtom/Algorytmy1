package Graphs;

public class Graphs {
    public static void main(String[] args) {
        //generateGraph(4, 0.5);
        //generateGnk(4, 3);
        transformEtoA(4, 3);
    }

    public static void generateGraph(int numberOfVertices, double probability) {
        boolean[][] result = GraphGnp.generateGnp(numberOfVertices, probability);
        PrintStructures.printA(result);
    }

    public static void generateGnk(int n, int k) {
        Edge[] result = GraphGnk.generateGnk(n, k);
        PrintStructures.printE(result);
    }

    public static void transformEtoA(int n, int k) {
        Edge[] graphGnk = GraphGnk.generateGnk(n, k);
        PrintStructures.printE(graphGnk);
        boolean[][] result = Transforms.transformEtoA(n, k, graphGnk);
        PrintStructures.printA(result);
    }

    // TODO transform A to E
}
