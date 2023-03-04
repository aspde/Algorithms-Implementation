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

}
