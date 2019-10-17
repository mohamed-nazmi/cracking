package Chapter_08;

public class _11 {
    public static int getWays(int amount) {
        int[] cents = {25, 10, 5, 1};
        int[][] map = new int[amount + 1][cents.length];
        return getWays(amount, cents, 0, map);
    }

    private static int getWays(int amount, int[] cents, int index, int[][] map) {
        if (index >= cents.length - 1) {
            return 1;
        }
        if (map[amount][index] > 0) {
            return map[amount][index];
        }
        int value = cents[index];
        int ways = 0;
        for (int i = 0; i * value <= amount; i++) {
            ways += getWays(amount - i * value, cents, index + 1, map);
        }
        map[amount][index] = ways;
        return ways;
    }
}