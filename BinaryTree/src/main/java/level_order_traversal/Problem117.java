package level_order_traversal;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 填充每个节点的下一个右侧节点指针 II
 */
public class Problem117 {

    public Node connect(Node root) {
        if(root == null) {
            return null;
        }
        Deque<Node> queue = new ArrayDeque<>();

        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            Node preNode = null;
            Node node;
            for (int i = 0; i < size; i++) {
                node = queue.poll();
                if (i != 0) {
                    preNode.next = node;
                }
                preNode = node;

                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
