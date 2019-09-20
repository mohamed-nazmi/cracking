package Chapter_03;

import java.util.Stack;

public class _02 extends Stack<Integer> {
    private Stack<Integer> minStack;

    public _02() {
        minStack = new Stack<Integer>();
    }

    public void push(int value) {
        super.push(value);
        if (minStack.isEmpty() || value <= min())
            minStack.push(value);
    }

    public Integer pop() {
        int value = super.pop();
        if (value == min())
            minStack.pop();
        return value;
    }

    public int min() {
        return minStack.peek();
    }
}