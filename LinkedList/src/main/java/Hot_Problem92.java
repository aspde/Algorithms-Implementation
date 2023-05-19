
/**
 * 反转链表 II
 */
public class Hot_Problem92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode pre = dummyHead;
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }

        // 头插法
        ListNode cur = pre.next;
        for (int i = 0; i < right - left; i++) {
            ListNode insertNode = cur.next;
            cur.next = cur.next.next;
            ListNode headNode = pre.next;
            pre.next = insertNode;
            insertNode.next = headNode;
        }
        return dummyHead.next;
    }
}
