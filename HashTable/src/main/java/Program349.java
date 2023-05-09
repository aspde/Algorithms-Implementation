import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 */
public class Program349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        Set<Integer> result = new HashSet();

        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if(set.contains(i)) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(x -> x).toArray();
    }
}
