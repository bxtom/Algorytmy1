package Queue;

public class InvokeQueue {
    public static void main(String[] args) {
        invokeQueueOnArray();
    }

    public static void invokeQueueOnArray() {
        QueueOnArray queueOnArray = new QueueOnArray(5);
        System.out.println("isEmpty? " + queueOnArray.isEmpty());
        queueOnArray.addToQueue(10);
        queueOnArray.addToQueue(11);
        queueOnArray.addToQueue(5);
        System.out.println("isEmpty? " + queueOnArray.isEmpty());
        queueOnArray.printQueue();
        System.out.println("Last added: " + queueOnArray.getLastAdded());
        System.out.println("Peak: " + queueOnArray.getPickOfQueue());
        System.out.println("Removed: " + queueOnArray.removeFromQueue());
        System.out.println("Peak: " + queueOnArray.getPickOfQueue());
        queueOnArray.printQueue();
        System.out.println("isEmpty? " + queueOnArray.isEmpty());
    }
}
