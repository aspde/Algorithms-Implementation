package basic;

public class HeapSort implements SortAlgorithm {

    /**
     * 堆排序算法实现
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int n = array.length;
        heapify(array, n);
        // 大根堆转换成递增数组，不开辟额外空间
        while (n > 1) {
            swap(array, 1, n--);
            siftDown(array, 1, n);// 根节点下沉，维护大根堆
        }
        return array;
    }

    /**
     * 构造大根堆
     */
    private <T extends Comparable<T>> void heapify(T[] array, int n) {
        // 由底向上遍历非叶子节点元素
        for (int k = n / 2; k >= 1; k--) {
            siftDown(array, k, n);
        }
    }

    /**
     * 堆节点下沉
     */
    private <T extends Comparable<T>> void siftDown(T[] array, int k, int n) {
        // k节点有左孩子节点
        while (2 * k <= n) {
            int j = 2 * k;
            // k节点有右孩子节点且右孩子节点比左孩子节点大
            if (j < n && less(array, j, j + 1)) {
                j++;
            }
            if (!less(array, k, j)) {
                break;
            }
            swap(array, k, j);
            k = j;// 为了继续下沉
        }
    }

    private <T> void swap(T[] array, int i, int j) {
        T swap = array[i - 1];
        array[i - 1] = array[j - 1];
        array[j - 1] = swap;
    }

    private <T extends Comparable<T>> boolean less(T[] array, int firstElement, int secondElement) {
        return array[firstElement - 1].compareTo(array[secondElement - 1]) < 0;
    }
}
