public class SelectionSort implements SortAlgorithm {

    /**
     * 选择排序算法实现
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
