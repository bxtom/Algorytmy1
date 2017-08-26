package Graphs;

public class Transforms {
    public static boolean[][] transformEtoA(int n, int k, Edge[] e) {
        boolean[][] result = new boolean[n][n];

        int h = result.length;

        for (int i = h -1; i > h - 1 - k; i--) {
            result[e[i].getA()][e[i].getB()] = true;
            result[e[i].getB()][e[i].getA()] = true;
        }

        return result;
    }

    public static Edge[] transformAtoE(boolean[][] a, int n) {
        Edge[] result = Structures.generateEdgeArray(n);
        int index = result.length - 1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j]) {
                    moveItem(result, i, j, index);
                    index--;
                }
            }
        }

        return result;
    }

    public static StructS[] transformAtoS(boolean[][] a, int n) {
        StructS[] result = new StructS[n];
        for (int i = 0; i < n; i++) {
            StructS temp = new StructS();
            result[i] = temp;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j]) {
                    result[i].getCollection().add(j);
                    result[i].setCounter(result[i].getCounter() + 1);
                    result[j].getCollection().add(i);
                    result[j].setCounter(result[j].getCounter() + 1);
                }
            }
        }

        return result;
    }

    public static Edge[] moveItem(Edge[] result, int i, int j, int index) {
        for (int k = 0; k < result.length; k++) {
            if (result[k].getA() == i && result[k].getB() == j) {
                Edge temp = result[k];
                result[k] = result[index];
                result[index] = temp;
                break;
            }
        }

        return result;
    }
}
