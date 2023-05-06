import basic.InsertionSort;
import basic.SortAlgorithm;

public class InsertionSortTest extends SortingAlgorithmTest {
    @Override
    SortAlgorithm getSortAlgorithm() {
        return new InsertionSort();
    }
}