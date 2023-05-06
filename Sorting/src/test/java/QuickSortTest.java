import basic.QuickSort;
import basic.SortAlgorithm;

public class QuickSortTest extends SortingAlgorithmTest {
    @Override
    SortAlgorithm getSortAlgorithm() {
        return new QuickSort();
    }
}
