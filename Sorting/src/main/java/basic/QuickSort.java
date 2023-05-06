package basic;

public class QuickSort implements SortAlgorithm {

    /**
     * 双路快速排序算法实现
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        doSort(array, 0, array.length - 1);
        return array;
    }

    private <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
        if(left < right) {
            int pivot = randomPartition(array, left, right);
            doSort(array, left, pivot - 1);
            doSort(array, pivot + 1, right);
        }
    }

    /**
     * 随机化数组以避免基本有序的数组
     */
    private <T extends Comparable<T>> int randomPartition(T[] array, int left, int right) {
        int randomIndex = left + (int) (Math.random() * (right - left + 1));
        SortUtils.swap(array, randomIndex, left);
        return partition(array, left, right);
    }

    private <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        T pivot = array[left];// 选择最左面的元素作为分界点
        int i = left + 1;// 跳过分界点
        int j = right;

        while(i <= j) {
            // 从左到右找到第一个大于等于分界点的元素
            while(i <= right && SortUtils.less(array[i], pivot)) {
                ++i;
            }
            // 从右到左找到第一个小于等于分界点的元素
            while(j >= left + 1 && SortUtils.less(pivot, array[j])) {
                --j;
            }
            if(i <= j) {
                SortUtils.swap(array, i, j);
                ++i;
                --j;
            }
        }
        SortUtils.swap(array, left, j);// 将分界点放到正确的位置上
        return j;
    }
}
