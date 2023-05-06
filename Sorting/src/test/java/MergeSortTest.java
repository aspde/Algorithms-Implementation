import basic.MergeSort;
import basic.SortAlgorithm;

public class MergeSortTest extends SortingAlgorithmTest {
    @Override
    SortAlgorithm getSortAlgorithm() {
        return new MergeSort();
    }
}
