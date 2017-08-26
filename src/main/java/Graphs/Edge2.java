package Graphs;

public class Edge2 {
    private int a;
    private int b;
    private boolean flag;

    public Edge2() {
        this.a = 0;
        this.b = 0;
    }

    public Edge2(int a, int b, boolean flag) {
        this.a = a;
        this.b = b;
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
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
