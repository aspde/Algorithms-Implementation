import basic.Hot_QuickSort;
import basic.SortAlgorithm;

public class QuickSortTest extends SortingAlgorithmTest {
    @Override
    SortAlgorithm getSortAlgorithm() {
        return new Hot_QuickSort();
    }
}
