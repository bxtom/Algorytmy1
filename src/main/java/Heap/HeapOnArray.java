package Heap;

class HeapOnArray {
    private int[] heap;
    private int currentIndex = 0;

    HeapOnArray(int size) {
        this.heap = new int[size];
    }

    boolean isEmpty() {
        return this.currentIndex == 0;
    }

    void addToHeap(int item) {
        if (this.currentIndex < this.heap.length - 1) {
            this.heap[this.currentIndex] = item;
            this.currentIndex++;
        }
    }

    int removeFromHeap() {
        if (this.currentIndex > 0) {
            this.currentIndex--;
            return this.heap[this.currentIndex];
        }
        return 0;
    }

    int getPeakOfHeap() {
        return this.heap[this.currentIndex - 1];
    }

    void printHeap() {
        for (int i = 0; i < this.currentIndex; i++) {
            System.out.println("Element stosu: " + this.heap[i]);
        }
    }
}
