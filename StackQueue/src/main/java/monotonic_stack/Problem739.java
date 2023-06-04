package monotonic_stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 每日温度
 */
public class Problem739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new LinkedList();

        for (int i = 0; i < temperatures.length; i++) {
            while(stack.peek() != null && temperatures[i] > temperatures[stack.peek()]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
