package Chapter_02;

import java.util.Stack;

public class _06 {
    public static int getListLength(LinkedListNode head) {
        int count = 0;
        LinkedListNode p = head;

        while(p != null) {
            p = p.next;
            count++;
        }

        return count;
    }

    public static boolean isPalindrome(LinkedListNode head) {
        int length = getListLength(head);
        Stack<Integer> stack = new Stack<Integer>();

        LinkedListNode p = head;
        for (int i = 1; i <= length / 2; i++) {
            stack.push(p.data);
            p = p.next;
        }

        if (length % 2 == 1) 
            p = p.next;
        
        while (p != null) {
            if (p.data != stack.pop())
                return false;
            p = p.next;
        }

        return true;
    }
}