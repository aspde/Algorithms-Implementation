import java.util.ArrayDeque;

/**
 * 接雨水
 */
public class Program42 {

    // 单调栈解法
    public int trap(int[] height) {

        int sum = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < height.length; i++) {
            while(!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int middle = height[stack.pop()];
                if(!stack.isEmpty()) {
                    int high = Math.min(height[stack.peek()], height[i]) - middle;
                    int width = i - stack.peek() - 1;
                    sum += high * width;
                }
            }
            stack.push(i);
        }

        return sum;
    }
}
