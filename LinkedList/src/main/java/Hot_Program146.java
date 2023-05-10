import java.util.HashMap;
import java.util.Map;

/**
 * LRU 缓存
 */
public class Hot_Program146 {

    class LRUCache {
        class Node {
            private int key;
            private int value;
            private Node  prev;
            private Node  next;

            public Node (int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        class DoubleList {
            private Node head, tail;
            private int size;

            public DoubleList() {
                head = new Node(0, 0);
                tail = new Node(0, 0);
                head.next = tail;
                tail.prev = head;
                size = 0;
            }

            public void addFirst(Node node) {
                node.prev = head;
                node.next = head.next;
                head.next.prev = node;
                head.next = node;
                size++;
            }

            public void remove(Node node) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                size--;
            }

            private Node removeLast() {
                if(tail.prev == head) {
                    return null;
                }
                Node last = tail.prev;
                remove(last);
                return last;
            }

            public int size() {
                return size;
            }
        }

        private Map<Integer, Node> map;
        private DoubleList cache;
        private int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();
            cache = new DoubleList();
        }

        public int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            }
            makeRecently(key);
            return map.get(key).value;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                deleteKey(key);
                addRecently(key, value);
                return;
            }
            if (cache.size == capacity) {
                removeLeastRecently();
            }
            addRecently(key, value);
        }

        /**
         * 将key设置为最近使用
         */
        private void makeRecently(int key) {
            Node node = map.get(key);
            cache.remove(node);
            cache.addFirst(node);
        }

        /**
         * 添加最近使用的元素
         */
        private void addRecently(int key, int value) {
            Node node = new Node(key, value);
            cache.addFirst(node);
            map.put(key, node);
        }

        /**
         * 删除key
         */
        private void deleteKey(int key) {
            Node node = map.get(key);
            cache.remove(node);
            map.remove(key);
        }

        /**
         * 删除最久未使用的元素
         */
        private void removeLeastRecently() {
            Node node = cache.removeLast();
            map.remove(node.key);
        }
    }
}
