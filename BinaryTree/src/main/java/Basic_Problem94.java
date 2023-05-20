import level_order_traversal.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的中序遍历
 */
public class Basic_Problem94 {

    // 递归实现
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode cur, List<Integer> result){
        if(cur == null) {
            return;
        }
        inorder(cur.left, result);
        result.add(cur.val);
        inorder(cur.right, result);
    }

    // 迭代实现
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (node.right != null) {
                    stack.push(node.right);
                }
                stack.push(node);
                stack.push(null);
                if (node.left != null) {
                    stack.push(node.left);
                }
            } else {
                result.add(stack.pop().val);
            }
        }
        return result;
    }
}
