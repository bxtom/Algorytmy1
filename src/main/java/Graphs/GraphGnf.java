package Graphs;

public class GraphGnf {
    public static Edge2[] generateGraphGnf(int vertexNumber, int maxVertexDegree) {
        Edge2[] edge2Aarray = Structures.genaerateEdge2Array(vertexNumber);
        int[] neighborCounterArray = new int[vertexNumber];

        int maxIndex = edge2Aarray.length - 1;
        for (int i = 0; i < edge2Aarray.length; i++) {
            int randomIndex = (int) (Math.random() * maxIndex);

            if (neighborCounterArray[edge2Aarray[maxIndex].getA()] < maxVertexDegree &&
                    neighborCounterArray[edge2Aarray[maxIndex].getB()] < maxVertexDegree) {

                edge2Aarray[maxIndex].setFlag(true);
                neighborCounterArray[edge2Aarray[maxIndex].getA()]++;
                neighborCounterArray[edge2Aarray[maxIndex].getB()]++;
            }

            Edge2 tempEdge2 = edge2Aarray[randomIndex];
            edge2Aarray[randomIndex] = edge2Aarray[maxIndex];
            edge2Aarray[maxIndex] = tempEdge2;

            maxIndex--;
        }

        return edge2Aarray;
    }
}
