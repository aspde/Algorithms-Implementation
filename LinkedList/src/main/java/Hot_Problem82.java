
/**
 * 删除排序链表中的重复元素 II
 */
public class Hot_Problem82 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;

        while(cur != null && cur.next != null) {
            if(cur.val == cur.next.val) {
                int value = cur.val;
                while(cur != null && cur.val == value) {
                    cur = cur.next;
                }
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}