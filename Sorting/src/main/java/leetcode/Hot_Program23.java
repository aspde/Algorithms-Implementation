package leetcode;

/**
 * 合并 K 个升序链表
 */
public class Hot_Program23 {

    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        int mid = (left + right) >>> 1;
        if(left == right) {
            return lists[left];
        }
        if (left > right) {
            return null;
        }
        ListNode node1 = merge(lists, left, mid);
        ListNode node2 = merge(lists, mid + 1, right);
        return mergeTwoLists(node1, node2);
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }

        ListNode dummyHead = new ListNode();
        ListNode cur = dummyHead;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 == null ? list2:list1;
        return dummyHead.next;
    }
}
