package Queue;

public class InvokeQueue {
    public static void main(String[] args) {
        //invokeQueueOnArray();
        invokeQueue();
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

    public static void invokeQueue() {
        Queue queue = new Queue();
        System.out.println("isEmpty? " + queue.isEmpty());
        queue.addToQueue(10);
        queue.addToQueue(11);
        queue.addToQueue(5);
        queue.printQueue();
        System.out.println("isEmpty? " + queue.isEmpty());
        System.out.println("Peak: " + queue.getPeakOfQueue());
        System.out.println("Last added: " + queue.getLastAdded());
        System.out.println("Removed: " + queue.removeFromQueue());
        System.out.println("Peak: " + queue.getPeakOfQueue());
    }
}
