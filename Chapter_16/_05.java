package Chapter_16;

public class _05 {
    public static Integer countTrailingZeros(int n) {
        if (n < 0) return null;

        int trailingZeros = 0;
        for (int i = 5; n / i > 0; i *= 5) {
            trailingZeros += n / i;
        }
        return trailingZeros;
    }
}