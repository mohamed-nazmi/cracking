package Chapter_08;

public class _01 {
    public static int countWays(int steps) {
        int sum = 0, a = 0, b = 0, c = 1;
        for (int i = 0; i < steps; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return sum;
    }
}