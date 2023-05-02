public class SelectionSort implements SortAlgorithm {

    /**
     * 泛型选择排序算法实现
     *
     * @param array 未排序的数组
     * @param <T>      数组中元素的类型
     * @return 排序后的数组
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < size; ++j) {
                if(SortUtils.greater(array[minIndex], array[j])) {
                    minIndex = j;
                }
            }
            SortUtils.swap(array, minIndex, i);
        }
        return array;
    }
}
