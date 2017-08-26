package Graphs;

import java.util.ArrayList;

public class StructS {
    private ArrayList<Integer> collection;
    private int counter;

    public StructS() {
        this.collection = new ArrayList<Integer>();
        this.counter = 0;
    }

    public ArrayList<Integer> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Integer> collection) {
        this.collection = collection;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "StructS{" +
                "collection=" + collection +
                ", counter=" + counter +
                '}';
    }
}
