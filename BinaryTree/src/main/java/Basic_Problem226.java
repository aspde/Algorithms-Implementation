import level_order_traversal.TreeNode;

/**
 * 翻转二叉树
 */
public class Basic_Problem226 {

    // 前序遍历翻转
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private void swap(TreeNode node) {
        TreeNode temp =  node.left;
        node.left = node.right;
        node.right = temp;
    }
}
