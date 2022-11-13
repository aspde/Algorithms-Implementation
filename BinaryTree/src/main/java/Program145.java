import java.util.*;

/**
 * 二叉树的后序遍历
 */
public class Program145 {

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

    // 非递归实现
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        while(!stack.isEmpty()) {
           TreeNode treeNode = stack.pop();
            result.add(treeNode.val);
            if(treeNode.left != null) {
                stack.push(treeNode.left);
            }
            if(treeNode.right != null) {
                stack.push(treeNode.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
