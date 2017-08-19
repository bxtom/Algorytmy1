package Heap;

public class InvokeHeap {
    public static void main(String[] args) {
//        invokeHeapOnArray();
        invokeHeap();
    }

    public static void invokeHeap() {
        Heap heap = new Heap();
        System.out.println(heap.isEmpty());
        heap.addToHeap(3);
        heap.addToHeap(7);
        heap.addToHeap(11);
        System.out.println(heap.isEmpty());
        System.out.println(heap.getPickOfHeap());
        System.out.println(heap.isEmpty());
        heap.printHeap();
        heap.removeFromHeap();
        heap.printHeap();

    }

    public static void invokeHeapOnArray() {
        HeapOnArray heap = new HeapOnArray(5);
        System.out.println(heap.isEmpty());
        heap.addToHeap(3);
        heap.addToHeap(7);
        heap.addToHeap(11);
        System.out.println(heap.isEmpty());
        System.out.println(heap.getPeakOfHeap());
        System.out.println(heap.isEmpty());
        heap.printHeap();
        heap.removeFromHeap();
        heap.printHeap();
    }
}
