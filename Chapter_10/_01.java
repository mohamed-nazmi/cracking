package Chapter_10;

public class _01 {
    public static void merge(int[] a, int[] b, int sizeOfA, int sizeOfB) {
        int indexA = sizeOfA - 1;
        int indexB = sizeOfB - 1;
        int indexMerged = sizeOfA + sizeOfB - 1;

        while (indexB >= 0) {
            if (indexA >= 0 && a[indexA] > b[indexB]) {
                a[indexMerged] = a[indexA];
                indexA--;
            }
            else {
                a[indexMerged] = b[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }
}