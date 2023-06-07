import basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 路径总和 II
 */
public class Problem113 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return result;
        }
        pathSumHelper(root, targetSum);
        return result;
    }

    private void pathSumHelper(TreeNode root, int targetSum) {
        targetSum -= root.val;
        path.add(root.val);

        if(root.left == null && root.right == null) {
            if(targetSum == 0) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        if(root.left != null) {
            pathSumHelper(root.left, targetSum);
            path.removeLast();
        }
        if(root.right != null) {
            pathSumHelper(root.right, targetSum);
            path.removeLast();
        }
    }
}
