package level_order_traversal;

import basic.TreeNode;

/**
 * 二叉树的最大深度
 */
public class Problem104 {

    // 递归法
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
