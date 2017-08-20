package List;

public class List {
    private ListElement first = null;
    private ListElement last = null;

    public void addToList(int value) {
        ListElement newItem = new ListElement(value);

        if (this.first == null) {
            this.first = newItem;
        }

        if (this.last != null) {
            this.last.setNext(newItem);
            newItem.setPrev(this.last);
        }

        this.last = newItem;
    }

    public void removeFirst() {
        if (this.first != null) {
            this.first = this.first.getNext();
        }
    }

    public void removeLast() {
        if (this.last != null) {
            this.last = this.last.getPrev();
        }
    }

    public void removeByValue(int value) {
        ListElement temp = this.first;
        if (temp != null) {
            do {
                if (temp.getValue() == value) {
                    temp.getPrev().setNext(temp.getNext());
                    temp.getNext().setPrev(temp.getPrev());
                }
            } while (temp.getNext() != null);

        }
    }
}
