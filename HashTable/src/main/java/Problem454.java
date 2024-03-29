import java.util.HashMap;
import java.util.Map;

/**
 * 四数相加 II
 */
public class Problem454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap();
        int count = 0;

        for (int i : nums1) {
            for (int j : nums2) {
                if(map.containsKey(i + j)) {
                    map.put(i + j, map.get(i + j) + 1);
                } else {
                    map.put(i + j, 1);
                }
            }
        }
        for (int i : nums3) {
            for (int j : nums4) {
                if(map.containsKey(-(i + j))) {
                    count += map.get(-(i + j));
                }
            }
        }
        return count;
    }
}
