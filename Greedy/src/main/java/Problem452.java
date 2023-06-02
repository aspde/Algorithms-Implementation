import java.util.Arrays;
import java.util.Comparator;

/**
 * 用最少数量的箭引爆气球
 */
public class Problem452 {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if(points[i - 1][1] >= points[i][0]) {
                points[i][1] = Math.min(points[i - 1][1], points[i][1]);
            } else {
                count++;
            }
        }
        return count;
    }
}
