import basic.TreeNode;

/**
 * 完全二叉树的节点个数
 */
public class Problem222 {

    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftDepth = 0;
        int rightDepth = 0;

        while(left != null) {
            left = left.left;
            leftDepth++;
        }
        while(right != null) {
            right = right.right;
            rightDepth++;
        }

        if(leftDepth == rightDepth) {
            return (2 << leftDepth) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
