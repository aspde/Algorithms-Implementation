/**
 * 工具方法类
 */
final class SortUtils {

    /**
     * 数组交换位置的辅助方法
     *
     * @param array 想要交换元素的数组
     * @param idx   第一个元素的数组下标
     * @param idy   第二个元素的数组下标
     */
    static <T> boolean swap(T[] array, int idx, int idy) {
        T swap = array[idx];
        array[idx] = array[idy];
        array[idy] = swap;
        return true;
    }

    /**
     * 检查第一个元素是否比第二个元素大的方法
     *
     * @param v 第一个元素
     * @param w 第二个元素
     * @return 如果第一个元素比第二个元素大返回true
     */
    static <T extends Comparable<T>> boolean greater(T v, T w) {
        return v.compareTo(w) > 0;
    }

}
