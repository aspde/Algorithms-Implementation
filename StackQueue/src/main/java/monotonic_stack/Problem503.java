package monotonic_stack;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * 下一个更大元素II
 */
public class Problem503 {

    public int[] nextGreaterElements(int[] nums) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = nums.length;
        int[] result = new int[size];
        Arrays.fill(result, -1);

        for (int i = 0; i < size * 2; i++) {
            while(!stack.isEmpty() && nums[i % size] > nums[stack.peek()]) {
                result[stack.pop()] = nums[i % size];
            }
            stack.push(i % size);
        }
        return  result;
    }
}
