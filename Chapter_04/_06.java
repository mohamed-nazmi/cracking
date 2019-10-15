package Chapter_04;

public class _06 {
    private static BinaryTreeNode getLeftMost(BinaryTreeNode target) {
        if (target == null) return null;
        while (target.left != null)
           target = target.left;
        return target;
    }

    private static BinaryTreeNode getFirstGreaterAncestor(ExtendedBinaryTreeNode target) {
        if (target == null) return null;
        ExtendedBinaryTreeNode ancestor = target.parent;
        while (ancestor != null) {
            if (ancestor.data >= target.data) break;
            ancestor = ancestor.parent;
        }
        return ancestor;
    }

    public static BinaryTreeNode getSuccessor(ExtendedBinaryTreeNode target) {
        if (target == null) return null;
        BinaryTreeNode leftMostOfRightNode = getLeftMost(target.right);
        if (leftMostOfRightNode != null)
            return leftMostOfRightNode;
        return getFirstGreaterAncestor(target);
    }
}

class ExtendedBinaryTreeNode extends BinaryTreeNode {
    ExtendedBinaryTreeNode parent;

    ExtendedBinaryTreeNode(int d) {
        super(d);
    }
}