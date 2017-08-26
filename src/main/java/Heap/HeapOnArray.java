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

    public void quickCleanHeap() {
        this.currentIndex = 0;
    }

    public void cleanHeap() {
        for (int i = 0; i < this.heap.length; i++) {
            this.heap[i] = 0;
        }
        quickCleanHeap();
    }

    public void removeByValue(int value) {
        int[] temp = new int[this.heap.length];

        int tempIndex = 0;
        for (int i = 0; i < this.heap.length; i++) {
            if (this.heap[i] != value) {
                temp[tempIndex] = this.heap[i];
                tempIndex++;
            } else {
                this.currentIndex--;
            }

        }

        this.heap = temp;
    }

    public void removeByValueReplace(int value) {
        for (int i = 0; i < this.heap.length; i++) {
            if (this.heap[i] == value) {
                for (int j = i + 1; j < this.heap.length; j++) {
                    this.heap[j - 1] = this.heap[j];
                }
                this.currentIndex--;
            }
        }
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
