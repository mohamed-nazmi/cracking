package Chapter_02;

public class LinkedListNode {
    LinkedListNode next = null;
    int data;

    public LinkedListNode(int d) {
        data = d;
    }

    public void appendToTail(int d) {
        LinkedListNode last = new LinkedListNode(d);
        LinkedListNode current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = last;
    }
}