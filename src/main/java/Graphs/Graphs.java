package Graphs;

public class Graphs {
    public static void main(String[] args) {
        //generateGraph(4, 0.5);
        GraphGnk.generateGnk(4, 6);
    }

    public static void generateGraph(int numberOfVertices, double probability) {
        boolean[][] result = GraphGnp.generateGnp(numberOfVertices, probability);
        PrintStructures.printA(result);
    }
}
