package basic;

import java.util.*;

/**
 * 二叉树的后序遍历
 */
public class Basic_Problem145 {

    // 递归实现
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode cur, List<Integer> result){
        if(cur == null) {
            return;
        }
        postorder(cur.left, result);
        postorder(cur.right, result);
        result.add(cur.val);
    }

    // 迭代实现
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                stack.push(node);
                stack.push(null);
                if (node.right != null) {
                    stack.push(node.right);
                }
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
