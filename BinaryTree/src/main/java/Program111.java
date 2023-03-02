
/**
 * 二叉树的最小深度
 */
public class Program111 {

    public int minDepth(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if(root.left == null) {
            return rightDepth + 1;
        }
        if(root.right == null) {
            return leftDepth + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
