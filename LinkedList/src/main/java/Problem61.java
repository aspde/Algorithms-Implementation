
/**
 * 旋转链表
 */
public class Problem61 {

    public ListNode rotateRight(ListNode head, int k) {
        ListNode iter = head;
        int n = 1;
        while (iter.next != null) {
            iter = iter.next;
            n++;
        }
        iter.next = head;

        int add = n - k % n;
        while (add-- > 0) {
            iter = iter.next;
        }
        ListNode newHead = iter.next;
        iter.next = null;
        return newHead;
    }
}
