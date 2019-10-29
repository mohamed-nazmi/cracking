package Chapter_16;

public class _07 {
    private static int flip(int x) {
        return 1 ^ x;
    }

    private static int sign(int x) {
        // 1 -> positive; 0 -> negative
        return flip((x >> 31) & 0b1);
    }

    public static int getMax(int a, int b) {
        int sa = sign(a);
        int sb = sign(b);
        int sc = sign(a - b);

        int useSignA = sa ^ sb;
        int useSignC = flip(sa ^ sb);

        int j = sa * useSignA + sc * useSignC;
        int k = flip(j);
        return a * j + b * k;
    }
}