
/**
 * 移除链表元素，设置虚拟头节点，统一操作
 */
public class Program203 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;

        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
