package Chapter_02;

import java.util.HashSet;

public class _01 {
    public static void removeDups(LinkedListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null, current = head;

        while (current != null) {
            if (set.contains(current.data)) {
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    public static void removeDupsWithoutBuffers(LinkedListNode head) {
        LinkedListNode current = head, runner;
        while (current != null) {
            runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}