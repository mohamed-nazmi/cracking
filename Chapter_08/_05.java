package Chapter_08;

public class _05 {
    public static int multiply(int a, int b) {
        int bigger = a >= b ? a : b;
        int smaller = a < b ? a : b;
        return recursiveMultiply(bigger, smaller);
    }

    private static int recursiveMultiply(int bigger, int smaller) {
        if (smaller == 0) return 0;
        if (smaller == 1) return bigger;

        int halfSmaller = smaller >> 1;
        int halfProduct = recursiveMultiply(bigger, halfSmaller);

        if ((smaller & 1) == 0)
            return halfProduct << 1;

        return (halfProduct << 1) + bigger;
    }
}