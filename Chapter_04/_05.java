package Chapter_04;

public class _05 {
    public static boolean isValidBST(BinaryTreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBST(BinaryTreeNode root, int min, int max) {
        if (root == null) return true;
        if (root.data <= min || root.data > max)
            return false;
        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }
}