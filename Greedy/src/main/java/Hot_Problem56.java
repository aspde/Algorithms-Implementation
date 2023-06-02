import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 合并区间
 */
public class Hot_Problem56 {

    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> result = new LinkedList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if(result.getLast()[1] >= intervals[i][0]) {
                int start = result.getLast()[0];
                int end = Math.max(result.getLast()[1], intervals[i][1]);
                result.removeLast();
                result.add(new int[]{start, end});
            } else {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
