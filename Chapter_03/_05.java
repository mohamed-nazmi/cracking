package Chapter_03;

import java.util.Stack;

public class _05 {
    public static void sortStack(Stack<Integer> stack1) {
        Stack<Integer> stack2 = new Stack<Integer>();
        
        while (!stack1.isEmpty()) {
            int item = stack1.pop();

            while (!stack2.isEmpty() && stack2.peek() > item)
                stack1.push(stack2.pop());

            stack2.push(item);
        }

        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
    }
}