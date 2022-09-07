import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void main() {

        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(integers);

        for (int i = 0; i < integers.length - 1; ++i) {
            assert integers[i] <= integers[i + 1];
        }
        System.out.println(Arrays.toString(integers));
        /* output: [1, 4, 6, 9, 12, 23, 54, 78, 231] */

        String[] strings = {"c", "a", "e", "b", "d"};
        bubbleSort.sort(strings);
        for (int i = 0; i < strings.length - 1; i++) {
            assert strings[i].compareTo(strings[i + 1]) <= 0;
        }
        System.out.println(Arrays.toString(strings));
        /* output: [a, b, c, d, e] */
    }
}
