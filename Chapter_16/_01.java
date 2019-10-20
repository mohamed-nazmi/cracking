package Chapter_16;

public class _01 {
    public static void swap(int[] arr, int i, int j) {
        if (arr == null || i == j || i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1)
            return;

        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        return;
    }
}