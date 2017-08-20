package Queue;

public class QueueElement {
    private int value;
    private QueueElement prev = null;

    public QueueElement(int value) {
        this.value = value;
    }

    public QueueElement(QueueElement item) {
        this.value = item.value;
        this.prev = item.prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public QueueElement getPrev() {
        return prev;
    }

    public void setPrev(QueueElement prev) {
        this.prev = prev;
    }
}
