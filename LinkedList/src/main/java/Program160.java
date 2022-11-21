
/**
 * 链表相交
 */
public class Program160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while (nodeA != nodeB) {

            nodeA = nodeA == null ? headB : nodeA.next;
            nodeB = nodeB == null ? headA : nodeB.next;
        }

        return nodeA;
    }
}
