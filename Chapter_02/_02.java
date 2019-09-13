package Chapter_02;

public class _02 {
    public static LinkedListNode returnKthToLast(LinkedListNode head, int k) {
        LinkedListNode runner = head;
        for (int i = 0; i < k; i++) {
            if (runner == null)
                return null;
            runner = runner.next;
        }

        LinkedListNode target = head;
        while (runner != null) {
            runner = runner.next;
            target = target.next;
        }

        return target;
    }
}