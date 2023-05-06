package basic;

import java.util.Random;

public class SortUtilsRandomGenerator {

    private static final Random random;
    private static final long seed;

    static {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    /**
     * 函数生成具有预定义大小的Double数组
     *
     * @param size 数组长度
     * @return Double数组，随机生成，每一个元素在[0, 1)之间
     */
    public static Double[] generateArray(int size) {
        Double[] arr = new Double[size];
        for (int i = 0; i < size; i++)
            arr[i] = generateDouble();
        return arr;
    }

    /**
     * 函数生成Double值
     *
     * @return Double值在[0, 1)之间
     */
    public static Double generateDouble() {
        return random.nextDouble();
    }

    /**
     * 函数生成int值
     *
     * @return int值在[0, n)之间
     */
    public static int generateInt(int n) {
        return random.nextInt(n);
    }
}
