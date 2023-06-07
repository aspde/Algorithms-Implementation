import basic.TreeNode;

import java.util.LinkedList;

/**
 * 求根节点到叶节点数字之和
 */
public class Problem129 {

    LinkedList<Integer> path = new LinkedList();
    int result = 0;

    public int sumNumbers(TreeNode root) {
        sumNumbersHelper(root);
        return result;
    }

    private void sumNumbersHelper(TreeNode node) {
        path.add(node.val);

        if(node.left == null && node.right == null) {
            result += pathToInt();
        }

        if(node.left != null) {
            sumNumbersHelper(node.left);
            path.removeLast();
        }
        if(node.right != null) {
            sumNumbersHelper(node.right);
            path.removeLast();
        }
    }

    private int pathToInt() {
        int sum = 0;
        for(int num : path) {
            sum = sum * 10 + num;
        }
        return sum;
    }
}
