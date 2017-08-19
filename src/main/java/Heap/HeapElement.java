package Heap;

public class HeapElement {
    private int value;
    private HeapElement prev = null;

    public HeapElement(int value, HeapElement prev) {
        this.value = value;
        this.prev = prev;
    }

    public HeapElement(HeapElement  item) {
        this.value = item.value;
        this.prev = item.prev;
    }

    public int getValue() {
        return value;
    }

    public HeapElement getPrev() {
        return prev;
    }
}
