package Heap;

class Heap {
    private HeapElement top = null;

    void addToHeap(int value) {
        this.top = new HeapElement(value, this.top);
    }

    void removeFromHeap() {
        if (this.top != null) {
//            int temp = top.getValue();
            this.top = top.getPrev();
        }
    }

    void removeByValue(int value) {
        if (this.top != null) {
            HeapElement temp = this.top;
            do {
                if (this.top.getValue() == value) {
                    if (temp == null) {
                        this.top = this.top.getPrev();
                    }
                }
                temp = this.top.getPrev();
            } while (temp != null);
        }
    }

    boolean isEmpty() {
        return this.top == null;
    }

    int getPickOfHeap() {
        if(!this.isEmpty())
            return this.top.getValue();
        else
            return -1;
    }

    void printHeap() {
        HeapElement temp = new HeapElement(top);
        while(this.top != null) {
            System.out.println(this.top.getValue());
            temp = temp.getPrev();
        }
    }
}
