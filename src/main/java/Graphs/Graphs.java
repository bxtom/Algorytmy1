package Graphs;

public class Graphs {
    public static void main(String[] args) {
        //generateGraph(4, 0.5);
        //generateGnk(4, 3);
        //transformEtoA(4, 3);
        transformAtoE(4, 0.5);
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

    public static void transformAtoE(int n, double p) {
        boolean[][] a = GraphGnp.generateGnp(n, p);
        PrintStructures.printA(a);
        Edge[] e = Transforms.transformAtoE(a, n);
        PrintStructures.printE(e);
    }
}
