package Heap;

public class Heap {
    private HeapElement top = null;

    public void addToHeap(int value) {
        this.top = new HeapElement(value, this.top);
    }

    public int removeFromHeap() {
        if (this.top != null) {
            int temp = top.getValue();
            this.top = top.getPrev();
            return temp;
        }

        return -1;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int getPickOfHeap() {
        if(!this.isEmpty())
            return this.top.getValue();
        else
            return -1;
    }

    public void printHeap() {
        HeapElement temp = new HeapElement(top);
        while(this.top != null) {
            System.out.println(this.top.getValue());
            temp = temp.getPrev();
        }
    }

}
