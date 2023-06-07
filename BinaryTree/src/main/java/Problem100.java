import basic.TreeNode;

/**
 * 相同的树
 */
public class Problem100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return compare(p, q);
    }

    private boolean compare(TreeNode tree1, TreeNode tree2) {
        if(tree1 == null && tree2 != null) {
            return false;
        } else if (tree1 != null && tree2 == null) {
            return false;
        } else if (tree1 == null && tree2 == null) {
            return true;
        } else if (tree1.val != tree2.val) {
            return false;
        }

        boolean left = compare(tree1.left, tree2.left);
        boolean right = compare(tree1.right, tree2.right);
        return left && right;
    }
}
