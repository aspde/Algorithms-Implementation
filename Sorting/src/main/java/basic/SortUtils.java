package basic;

import java.util.List;

public final class SortUtils {

    /**
     * 数组中在给定的位置交换两个元素
     *
     * @param array 想要交换元素的数组
     * @param i   交换的第一个元素的数组下标
     * @param j   交换的第二个元素的数组下标
     */
    public static <T> void swap(T[] array, int i, int j) {
        T swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }

    /**
     * 比较两个元素判断第一个是否比第二个小
     *
     * @param firstElement 第一个元素
     * @param secondElement 第二个元素
     * @return 如果第一个元素比第二个元素小返回true，否则返回false
     */
    public static <T extends Comparable<T>> boolean less(T firstElement, T secondElement) {
        return firstElement.compareTo(secondElement) < 0;
    }

    /**
     * 比较两个元素判断第一个是否比第二个大
     *
     * @param firstElement 第一个元素
     * @param secondElement 第二个元素
     * @return 如果第一个元素比第二个元素大返回true，否则返回false
     */
    public static <T extends Comparable<T>> boolean greater(T firstElement, T secondElement) {
        return firstElement.compareTo(secondElement) > 0;
    }

    /**
     * 检查数组是否按升序排序
     * @param array 检查的数组
     * @return 如果数组按升序排序返回true，否则返回false
     */
    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查集合是否按升序排序
     * @param list 检查的集合
     * @return 如果数组按升序排序返回true，否则返回false
     */
    public static <T extends Comparable<T>> boolean isSorted(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            if (less(list.get(i), list.get(i - 1))) {
                return false;
            }
        }
        return true;
    }
}
