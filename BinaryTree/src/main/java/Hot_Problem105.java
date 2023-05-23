import basic.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 从前序与中序遍历序列构造二叉树
 */
public class Hot_Problem105 {

    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return findNode(inorder, 0, inorder.length, preorder, 0, preorder.length);
    }

    private TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] preorder, int preBegin, int preEnd) {
        if(inBegin >= inEnd || preBegin >= preEnd) {
            return null;
        }

        int rootIndex = map.get(preorder[preBegin]);
        TreeNode root = new TreeNode(inorder[rootIndex]);
        int leftLength = rootIndex - inBegin;
        root.left = findNode(inorder, inBegin, rootIndex,
                preorder, preBegin + 1, preBegin + leftLength + 1);
        root.right = findNode(inorder, rootIndex + 1, inEnd,
                preorder, preBegin + leftLength + 1, preEnd);
        return root;
    }
}
