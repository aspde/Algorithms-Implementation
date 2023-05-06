import basic.HeapSort;
import basic.SortAlgorithm;

public class HeapSortTest extends SortingAlgorithmTest {
    @Override
    SortAlgorithm getSortAlgorithm() {
        return new HeapSort();
    }
}
