package Chapter_05;

public class _07 {
    public static int swapBits(int x) {
        return ((x << 1) & 0xaaaaaaaa) | ((x >>> 1) & 0x55555555);
    }
}