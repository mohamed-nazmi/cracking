package Chapter_04;

public class _04 {
    private static int getHeight(BinaryTreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static boolean isBalanced(BinaryTreeNode root) {
        if (root == null) return true;
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}