package basic;

public class MergeSort implements SortAlgorithm {

    @SuppressWarnings("rawtypes")
    private static Comparable[] aux;

    /**
     * 归并排序算法实现
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        aux = new Comparable[array.length];
        doSort(array, 0, array.length - 1);
        return array;
    }

    private <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
        if(left < right) {
            int mid = (left + right) >>> 1;
            doSort(array, left, mid);
            doSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    /**
     * 合并两个有序队列
     */
    @SuppressWarnings("unchecked")
    private <T extends Comparable<T>> void merge(T[] array, int left, int mid, int right) {
        System.arraycopy(array, left, aux, left, right + 1 - left);

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                array[k] = (T) aux[j++];
            } else if (j > right) {
                array[k] = (T) aux[i++];
            } else if (SortUtils.less(aux[i], aux[j])) {
                array[k] = (T) aux[i++];
            } else {
                array[k] = (T) aux[j++];
            }
        }
    }
}