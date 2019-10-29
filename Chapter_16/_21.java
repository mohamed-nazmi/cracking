package Chapter_16;

import java.util.HashSet;

public class _21 {
    private static int getSum(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        return sum;
    }

    private static HashSet<Integer> fillHashSetFromArray(int[] array) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int a : array) {
            set.add(a);
        }
        return set;
    }

    public static int[] detectSwapValues(int[] array1, int[] array2) {
        int sum1 = getSum(array1);
        int sum2 = getSum(array2);

        int diff = sum1 - sum2;
        if (diff % 2 != 0) return null;

        int target = diff / 2;
        HashSet<Integer> set = fillHashSetFromArray(array2);

        for (int val1 : array1) {
            int val2 = val1 - target;
            if (set.contains(val2)) {
                return new int[] { val1, val2 };
            }
        }
        return null;
    }
}