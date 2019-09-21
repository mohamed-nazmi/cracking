package Chapter_03;

import java.util.Stack;

public class _04 {
    public static class MyQueue<T> {
        private Stack<T> stackNewest, stackOldest;

        public MyQueue() {
            stackNewest = new Stack<T>();
            stackOldest = new Stack<T>();
        }

        public int size() {
            return stackNewest.size() + stackOldest.size();
        }

        public void enqueue(T value) {
            stackNewest.push(value);
        }

        private void shiftStacks() {
            if (stackOldest.isEmpty())
                while (!stackNewest.isEmpty())
                    stackOldest.push(stackNewest.pop());
        }

        public T dequeue() {
            shiftStacks();
            return stackOldest.pop();
        }

        public T peek() {
            shiftStacks();
            return stackOldest.peek();
        }
    }
}