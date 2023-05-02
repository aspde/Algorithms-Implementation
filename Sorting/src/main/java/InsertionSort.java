
public class InsertionSort implements SortAlgorithm {

    /**
     * 泛型插入排序算法实现
     *
     * @param array 未排序的数组
     * @param <T>      数组中元素的类型
     * @return 排序后的数组
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
