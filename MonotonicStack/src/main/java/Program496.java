import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 下一个更大元素 I
 */
public class Program496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < nums2.length; i++) {
            while(!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int pre = nums2[stack.pop()];
                if(map.containsKey(pre)) {
                    result[map.get(pre)] = nums2[i];
                }
            }
            stack.push(i);
        }
        return result;
    }
}
