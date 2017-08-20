package Graphs;

public class Edge {
    private int a;
    private int b;

    public Edge() {
        this.a = 0;
        this.b = 0;
    }

    public Edge(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
