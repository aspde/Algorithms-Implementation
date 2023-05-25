
/**
 * 两数相加
 */
public class Hot_Problem2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode cur = dummyHead;

        int remainder = 0;
        while(l1 != null || l2 != null) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int num = n1 + n2 + remainder;

            remainder = num / 10;
            cur.next = new ListNode(num % 10);
            cur = cur.next;

            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(remainder == 1) {
            cur.next = new ListNode(remainder);
        }
        return dummyHead.next;
    }
}
