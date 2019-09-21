package Chapter_03;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class _03 {
    public static class SetOfStacks {
        private ArrayList<Stack<Integer>> stacks;
        private int maxStackCapacity;
        private int stackIdx = 0;

        public SetOfStacks(int max) {
            stacks = new ArrayList<Stack<Integer>>();
            stacks.add(new Stack<Integer>());
            maxStackCapacity = max;
        }

        public void push(int value) {
            Stack<Integer> stack = stacks.get(stackIdx);
            if (stack.size() != maxStackCapacity)
                stacks.get(stackIdx).push(value);

            else {
                stackIdx++;
                stacks.add(new Stack<Integer>());
                stacks.get(stackIdx).push(value);
            }
        }

        public int pop() {
            Stack<Integer> stack = stacks.get(stackIdx);
            int value = stack.pop();

            if (stack.size() == 0 && stackIdx != 0)
                stackIdx--;

            return value;
        }

        public int popAt(int index) {
            if (index > stackIdx) 
                throw new EmptyStackException();

            Stack<Integer> stack = stacks.get(index);
            return stack.pop();
        }
    }
}