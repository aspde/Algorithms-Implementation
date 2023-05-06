import basic.BubbleSort;
import basic.SortAlgorithm;

public class BubbleSortTest extends SortingAlgorithmTest {
    @Override
    SortAlgorithm getSortAlgorithm() {
        return new BubbleSort();
    }
}
