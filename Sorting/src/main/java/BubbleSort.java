public class BubbleSort implements SortAlgorithm {

    /**
     * 泛型冒泡排序算法实现
     *
     * @param array 未排序的数组
     * @param <T>      数组中元素的类型
     * @return 排序后的数组
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 1, size = array.length; i < size; ++i) {
            boolean swapped = false;
            for (int j = 0; j < size - i; ++j) {
                if (SortUtils.greater(array[j], array[j + 1])) {
                    SortUtils.swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }
}
