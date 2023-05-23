package level_order_traversal;

import basic.TreeNode;

import java.util.*;

/**
 * 二叉树的锯齿形层序遍历
 */
public class Hot_Problem103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        boolean flag = true;
        while(!stack.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            Deque<TreeNode> next = new LinkedList<>();
            while(!stack.isEmpty()) {
                TreeNode node = stack.pop();
                subList.add(node.val);
                if(flag) {
                    if(node.left != null) {
                        next.push(node.left);
                    }
                    if(node.right != null) {
                        next.push(node.right);
                    }
                } else {
                    if(node.right != null) {
                        next.push(node.right);
                    }
                    if(node.left != null) {
                        next.push(node.left);
                    }
                }
            }
            stack = next;
            flag = !flag;
            result.add(subList);
        }
        return result;
    }
}
