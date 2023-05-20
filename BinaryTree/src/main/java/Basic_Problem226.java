import level_order_traversal.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 翻转二叉树
 */
public class Basic_Problem226 {

    // 前序遍历翻转，递归实现
    public TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return null;
        }
        swap(root);
        invertTree1(root.left);
        invertTree1(root.right);
        return root;
    }

    // 前序遍历翻转，迭代实现
    public TreeNode invertTree2(TreeNode root) {
        if (root == null){
            return null;
        }
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            swap(node);
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return root;
    }

    private void swap(TreeNode node) {
        TreeNode temp =  node.left;
        node.left = node.right;
        node.right = temp;
    }
}
