import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的前序遍历
 */
public class Basic_Program144 {

    // 递归实现
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode cur, List<Integer> result){
        if(cur == null) {
            return;
        }
        result.add(cur.val);
        preorder(cur.left, result);
        preorder(cur.right, result);
    }

    // 非递归实现
    public List<Integer> preorderTraversal2(TreeNode root) {
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
                if (node.left != null) {
                    stack.push(node.left);
                }
                stack.push(node);
                stack.push(null);
            } else {
                result.add(stack.pop().val);
            }
        }
        return result;
    }
}
