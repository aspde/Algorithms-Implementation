package level_order_traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 二叉树的层序遍历
 */
public class Basic_Problem102 {

    // 借助队列实现
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Deque<TreeNode> queue = new ArrayDeque();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            int size = queue.size();
            while(size-- > 0) {
                TreeNode node = queue.poll();
                subList.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(subList);
        }
        return result;
    }
}
