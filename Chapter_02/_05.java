package Chapter_02;

public class _05 {
    public static class ReverseList {
        public static LinkedListNode addReverseLists(LinkedListNode p1, LinkedListNode p2) {
            return addReverseLists(p1, p2, 0);
        }

        private static LinkedListNode addReverseLists(LinkedListNode p1, LinkedListNode p2, int carry) {
            if (p1 == null && p2 == null && carry == 0) return null;

            int sum = carry;
            if (p1 != null) sum += p1.data;
            if (p2 != null) sum += p2.data;

            LinkedListNode currentDigit = new LinkedListNode(sum % 10);
            currentDigit.next = addReverseLists(
                p1 != null ? p1.next : null,
                p2 != null ? p2.next : null,
                sum / 10
            );

            return currentDigit;
        }
    }

    public static class ForwardList {
        private static class PartialSum {
            LinkedListNode digit = null;
            int carry = 0;

            PartialSum() {}

            PartialSum(LinkedListNode d, int c) { digit = d; carry = c; }
        }

        private static int getListLength(LinkedListNode head) {
            int count = 0;
            LinkedListNode p = head;

            while (p != null) {
                p = p.next;
                count++;
            }

            return count;
        }

        private static LinkedListNode insertBefore(LinkedListNode list, int data) {
            LinkedListNode node = new LinkedListNode(data);
            node.next = list;
            return node;
        }

        private static LinkedListNode padList(LinkedListNode head, int padding) {
            LinkedListNode p = head;

            for (int i = 0; i < padding; i++)
                p = insertBefore(p, 0);

            return p;
        }

        private static PartialSum addListsHelper(LinkedListNode p1, LinkedListNode p2) {
            if (p1 == null && p2 == null) return new PartialSum();

            PartialSum nextPartialSum = addListsHelper(p1.next, p2.next);
            int sum = p1.data + p2.data + nextPartialSum.carry;

            LinkedListNode currentDigit = new LinkedListNode(sum % 10);
            currentDigit.next = nextPartialSum.digit;

            return new PartialSum(currentDigit, sum / 10);
        }

        public static LinkedListNode addForwardLists(LinkedListNode head1, LinkedListNode head2) {
            if (head1 == null) return head2;
            if (head2 == null) return head1;

            int len1 = getListLength(head1);
            int len2 = getListLength(head2);

            LinkedListNode p1 = head1, p2 = head2;
            if (len1 > len2)
                p2 = padList(head2, len1 - len2);
            if (len2 > len1)
                p1 = padList(head1, len2 - len1);

            PartialSum partialsum = addListsHelper(p1, p2);
            LinkedListNode result = partialsum.digit;

            if (partialsum.carry != 0)
                result = insertBefore(result, partialsum.carry);

            return result;
        }
    }
}