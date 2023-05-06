package basic;

import java.util.Arrays;
import java.util.List;

/**
 * 排序算法的通用接口
 */
public interface SortAlgorithm {

    /**
     * 数组排序算法方法
     *
     * @param unsorted 未排序的数组
     * @param <T>      数组中元素的类型
     * @return 排序后的数组
     */
    <T extends Comparable<T>> T[] sort(T[] unsorted);

    /**
     * 辅助方法，用于处理list集合的算法
     *
     * @param unsorted 未排序的数组
     * @param <T>      数组中元素的类型
     * @return 排序后的数组
     */
    @SuppressWarnings("unchecked")
    default <T extends Comparable<T>> List<T> sort(List<T> unsorted) {
        return Arrays.asList(
                sort(unsorted.toArray((T[]) new Comparable[unsorted.size()]))
        );
    }
}
