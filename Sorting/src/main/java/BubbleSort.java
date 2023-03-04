public class BubbleSort implements SortAlgorithm {

    /**
     * 通用冒泡排序算法实现
     *
     * @param unsorted 未排序的数组
     * @param <T>      数组中元素的类型
     * @return 排序后的数组
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        for (int i = 1, size = unsorted.length; i < size; ++i) {
            boolean swapped = false;
            for (int j = 0; j < size - i; ++j) {
                if (SortUtils.greater(unsorted[j], unsorted[j + 1])) {
                    SortUtils.swap(unsorted, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return unsorted;
    }

}
