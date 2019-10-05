package Chapter_04;

public class _02 {
    public static BinaryTreeNode generateBST(int[] arr) {
        return generateBST(arr, 0, arr.length - 1);
    }

    private static BinaryTreeNode generateBST(int[] arr, int start, int end) {
        if (end < start) return null;

        int mid = (start + end) / 2;
        BinaryTreeNode root = new BinaryTreeNode(arr[mid]);
        root.left = generateBST(arr, start, mid - 1);
        root.right = generateBST(arr, mid + 1, end);
        return root;
    }
}