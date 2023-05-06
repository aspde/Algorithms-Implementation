import basic.SelectionSort;
import basic.SortAlgorithm;

public class SelectionSortTest extends SortingAlgorithmTest {
    @Override
    SortAlgorithm getSortAlgorithm() {
        return new SelectionSort();
    }
}
