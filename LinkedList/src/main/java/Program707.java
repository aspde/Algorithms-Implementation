/**
 * 设计链表
 */
public class Program707 {

    class ListNode{
        int val;

        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    class MyLinkedList {

        int size;
        // 虚拟头结点
        ListNode head;

        public MyLinkedList() {
            size = 0;
            head = new ListNode();
        }

        public int get(int index) {
            if(index < 0 || index >= size) {
                return -1;
            }
            ListNode cur = head;
            for (int i = 0; i <= index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if(index > size) {
                return;
            }
            if(index < 0) {
                index = 0;
            }
            size++;
            ListNode pre = head;
            for (int i = 0; i < index; i++) {
                pre = pre.next;
            }
            ListNode toAdd = new ListNode(val);
            toAdd.next = pre.next;
            pre.next = toAdd;
        }

        public void deleteAtIndex(int index) {
            if(index < 0 || index >= size) {
                return;
            }
            size--;
            ListNode pre = head;
            for (int i = 0; i < index; i++) {
                pre = pre.next;
            }
            pre.next = pre.next.next;
        }
    }
}
