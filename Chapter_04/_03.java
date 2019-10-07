package Chapter_04;

import java.util.ArrayList;

public class _03 {
    public static ArrayList<ArrayList<BinaryTreeNode>> getDepthLists(BinaryTreeNode root) {
        ArrayList<ArrayList<BinaryTreeNode>> result = new ArrayList<ArrayList<BinaryTreeNode>>();

        ArrayList<BinaryTreeNode> current = new ArrayList<BinaryTreeNode>();
        if (root != null)
            current.add(root);

        while (current.size() > 0) {
            result.add(current);
            ArrayList<BinaryTreeNode> parents = current;
            current = new ArrayList<BinaryTreeNode>();

            for (BinaryTreeNode parent : parents) {
                if (parent.left != null) {
                    current.add(parent.left);
                }
                if (parent.right != null) {
                    current.add(parent.right);
                }
            }
        }

        return result;
    }
}