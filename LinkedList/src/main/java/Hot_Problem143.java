
/**
 * 重排链表
 */
public class Hot_Problem143 {

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = slow.next;
        slow.next = null;

        ListNode left = head;
        right = reverseList(right);
        while (right != null){
            ListNode curLeft = left.next;
            left.next = right;
            left = curLeft;

            ListNode curRight = right.next;
            right.next = left;
            right = curRight;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp;

        while(cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
