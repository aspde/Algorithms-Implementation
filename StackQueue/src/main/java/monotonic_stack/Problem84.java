package monotonic_stack;

import java.util.ArrayDeque;

/**
 * 柱状图中最大的矩形
 */
public class Problem84 {

    // 单调栈解法
    public int largestRectangleArea(int[] heights) {
        int result = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int [] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        newHeights[newHeights.length - 1] = 0;
        for (int index = 0; index < heights.length; index++){
            newHeights[index + 1] = heights[index];
        }
        heights = newHeights;

        for (int i = 0; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int high = heights[stack.pop()];
                if(!stack.isEmpty()) {
                    int width = i - stack.peek() - 1;
                    result = Math.max(result, high * width);
                }
            }
            stack.push(i);
        }
        return result;
    }
}
