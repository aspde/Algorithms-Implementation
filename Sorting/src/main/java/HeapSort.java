public class HeapSort implements SortAlgorithm {

    /**
     * 堆排序算法实现
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int n = array.length;
        heapify(array, n);
        while (n > 1) {
            swap(array, 1, n--);
            siftDown(array, 1, n);
        }
        return array;
    }

    private static <T extends Comparable<T>> void heapify(T[] array, int n) {
        for (int k = n / 2; k >= 1; k--) {
            siftDown(array, k, n);
        }
    }

    private static <T extends Comparable<T>> void siftDown(T[] array, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(array, j, j + 1)) {
                j++;
            }
            if (!less(array, k, j)) {
                break;
            }
            swap(array, k, j);
            k = j;
        }
    }

    private static <T> void swap(T[] array, int i, int j) {
        T swap = array[i - 1];
        array[i - 1] = array[j - 1];
        array[j - 1] = swap;
    }

    private static <T extends Comparable<T>> boolean less(T[] array, int firstElement, int secondElement) {
        return array[firstElement - 1].compareTo(array[secondElement - 1]) < 0;
    }
}
