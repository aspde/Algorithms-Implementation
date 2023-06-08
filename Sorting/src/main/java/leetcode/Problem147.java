package leetcode;

/**
 * 对链表进行插入排序
 */
public class Problem147 {

    public ListNode insertionSortList(ListNode head) {
        ListNode dummyHead = new ListNode();
        ListNode pre = dummyHead;
        ListNode cur = head;

        while(cur != null) {
            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next;
            }
            ListNode next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            pre = dummyHead;
            cur = next;
        }
        return dummyHead.next;
    }
}
