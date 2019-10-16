package Chapter_08;

import java.util.Stack;

public class _06 {
    public static void adjustTowers(Stack<Integer> source, Stack<Integer> buffer, Stack<Integer> destination, int x) {
        if (x <= 0)
            return;

        adjustTowers(source, destination, buffer, x - 1);
        destination.push(source.pop());
        adjustTowers(buffer, source, destination, x - 1);
    }
}