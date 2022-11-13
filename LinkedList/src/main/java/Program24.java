/**
 * 两两交换链表中的节点
 */
public class Program24 {

    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;

        while(cur.next != null && cur.next.next != null) {

            ListNode temp = cur.next;
            ListNode temp1 = cur.next.next.next;
            cur.next = cur.next.next;
            cur.next.next = temp;
            cur.next.next.next = temp1;

            cur = cur.next.next;
        }
        return dummyHead.next;
    }
}
