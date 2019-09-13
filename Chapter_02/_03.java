package Chapter_02;

public class _03 {
    public static void deleteMiddleNode(LinkedListNode node) {
        if (node == null || node.next == null) return;

        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
    }
}