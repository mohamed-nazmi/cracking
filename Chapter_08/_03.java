package Chapter_08;

public class _03 {
    public static Integer getMagicIndex(int[] arr) {
        return getMagicIndex(arr, 0, arr.length - 1);
    }

    private static Integer getMagicIndex(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == mid) {
            return mid;
        }
        if (arr[mid] > mid) {
            return getMagicIndex(arr, start, mid - 1);
        }
        return getMagicIndex(arr, mid + 1, end);
    }

    public static Integer getMagicIndexForDuplicates(int[] arr) {
        return getMagicIndexForDuplicates(arr, 0, arr.length - 1);
    }

    private static Integer getMagicIndexForDuplicates(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == mid) {
            return mid;
        }

        int leftIndex = Math.min(arr[mid], mid - 1);
        Integer left = getMagicIndexForDuplicates(arr, start, leftIndex);
        if (left != null) {
            return left;
        }

        int rightIndex = Math.max(arr[mid], mid + 1);
        Integer right = getMagicIndexForDuplicates(arr, rightIndex, end);
        return right;
    }
}