import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsertionSortTest {

    private InsertionSort insertionSort;

    @BeforeEach
    void setUp() {
        insertionSort = new InsertionSort();
    }

    @Test
    void insertionSortSortEmptyArrayShouldPass() {
        testEmptyArray(insertionSort::sort);
    }

    private void testEmptyArray(Function<Integer[], Integer[]> sortAlgorithm) {
        Integer[] array = {};
        Integer[] sorted = sortAlgorithm.apply(array);
        Integer[] expected = {};
        assertArrayEquals(expected, sorted);
        assertTrue(SortUtils.isSorted(sorted));
    }

    @Test
    void insertionSortClassicalSortSingleValueArrayShouldPass() {
        testSingleValue(insertionSort::sort);
    }

    private void testSingleValue(Function<Integer[], Integer[]> sortAlgorithm) {
        Integer[] array = {7};
        Integer[] sorted = sortAlgorithm.apply(array);
        Integer[] expected = {7};
        assertArrayEquals(expected, sorted);
        assertTrue(SortUtils.isSorted(sorted));
    }

    @Test
    void insertionSortClassicalWithIntegerArrayShouldPass() {
        testIntegerArray(insertionSort::sort);
    }

    private void testIntegerArray(Function<Integer[], Integer[]> sortAlgorithm) {
        Integer[] array = {49, 4, 36, 9, 144, 1};
        Integer[] sorted = sortAlgorithm.apply(array);
        Integer[] expected = {1, 4, 9, 36, 49, 144};
        assertArrayEquals(expected, sorted);
        assertTrue(SortUtils.isSorted(sorted));
    }

    @Test
    void insertionSortClassicalForArrayWithNegativeValuesShouldPass() {
        testWithNegativeValues(insertionSort::sort);
    }

    private void testWithNegativeValues(Function<Integer[], Integer[]> sortAlgorithm) {
        Integer[] array = {49, -36, -144, -49, 1, 9};
        Integer[] sorted = sortAlgorithm.apply(array);
        Integer[] expected = {-144, -49, -36, 1, 9, 49};
        assertArrayEquals(expected, sorted);
        assertTrue(SortUtils.isSorted(sorted));
    }

    @Test
    void insertionSortClassicalForArrayWithDuplicateValuesShouldPass() {
        testWithDuplicates(insertionSort::sort);
    }

    private void testWithDuplicates(Function<Integer[], Integer[]> sortAlgorithm) {
        Integer[] array = {36, 1, 49, 1, 4, 9};
        Integer[] sorted = sortAlgorithm.apply(array);
        Integer[] expected = {1, 1, 4, 9, 36, 49};
        assertArrayEquals(expected, sorted);
        assertTrue(SortUtils.isSorted(sorted));
    }

    @Test
    void insertionSortClassicalWithStringArrayShouldPass() {
        testWithStringArray(insertionSort::sort);
    }

    private void testWithStringArray(Function<String[], String[]> sortAlgorithm) {
        String[] array = {"c", "a", "e", "b", "d"};
        String[] sorted = sortAlgorithm.apply(array);
        String[] expected = {"a", "b", "c", "d", "e"};
        assertArrayEquals(expected, sorted);
        assertTrue(SortUtils.isSorted(sorted));
    }
}