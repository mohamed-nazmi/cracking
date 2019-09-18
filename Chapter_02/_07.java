package Chapter_02;

public class _07 {
    public static LinkedListNode detectIntersection(LinkedListNode head1, LinkedListNode head2) {
        if (head1 == null || head2 == null)
            return null;

        LinkedListNode p1 = head1, p2 = head2;
        int count1 = 1, count2 = 1;

        while (p1.next != null) {
            p1 = p1.next;
            count1++;
        }

        while (p2.next != null) {
            p2 = p2.next;
            count2++;
        }

        if (p1 != p2)
            return null;

        p1 = head1;
        p2 = head2;

        for (int i = 0; i < count1 - count2; i++)
            p1 = p1.next;

        for (int i = 0; i < count2 - count1; i++)
            p2 = p2.next;

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}