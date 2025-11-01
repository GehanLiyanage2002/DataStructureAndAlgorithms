public class LinkedList {

    int size;
    ChainNode head;

    LinkedList() {
        this.size = 0;
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
    
    public void addFirst(int elt) {
        if (isEmpty()) {
            head = new ChainNode(elt);
        } else {
            head = new ChainNode(elt, head);
        }
        size++;
    }

    public void addLast(int elt) {
        if (isEmpty()) {
            head = new ChainNode(elt);
        } else {
            ChainNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ChainNode(elt);
        }
        size++;
    }

    public int removeFirst() {
        int removedValue = 0;
        if (isEmpty()) {
            System.out.println("LinkedList is Empty");
        } else {
            removedValue = head.data;
            head = head.next;
            size--;
        }
        return removedValue;
    }

    public int removeLast() {
        int removedValue = 0;
        if (isEmpty()) {
            System.out.println("LinkedList is Empty");
        } else {
            if (size == 1) {
                removedValue = head.data;
                head = null;
            }
            else {
                ChainNode current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                removedValue = current.next.data;
                current.next = null;
            }
        }
        return removedValue;
    }
}
