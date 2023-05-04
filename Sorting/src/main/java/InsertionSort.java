public class InsertionSort implements SortAlgorithm {

    /**
     * 插入排序算法实现
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for(int i = 0, size = array.length; i < size; ++i) {
            for(int j = i; j > 0 && SortUtils.less(array[j], array[j - 1]); --j) {
                SortUtils.swap(array, j, j-1);
            }
        }
        return array;
    }
}
