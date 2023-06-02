import java.util.Arrays;
import java.util.Comparator;

/**
 * 无重叠区间
 */
public class Problem435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int remove = 0;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i - 1][1] > intervals[i][0]) {
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
                remove++;
            }
        }
        return remove;
    }
}
