package topic_04;

import topic_02.Program203;

/**
 * 反转链表，高频
 */
public class Program206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 双指针解法
    public ListNode reverseList1(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;

        while(cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    // 递归解法
    public ListNode reverseList2(ListNode head) {

        return reverse(null, head);
    }

    private ListNode reverse(ListNode pre, ListNode cur) {

        if(cur == null) {
            return pre;
        }
        ListNode temp = cur.next;
        cur.next = pre;
        return reverse(cur, temp);
    }
}
