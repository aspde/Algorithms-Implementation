import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 滑动窗口最大值
 */
public class Hot_Problem239 {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int index = 0;

        // r为滑动窗口的右边界
        for (int r = 0; r < nums.length; r++) {
            // 维护单调队列
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[r]) {
                deque.removeLast();
            }
            // 存储数组下标，便于判断最大值越界
            deque.add(r);
            // 判断最大值是否越界
            if(deque.peek() == r - k) {
                deque.removeFirst();
            }
            // 窗口形成，加入结果集
            if(r >= k - 1) {
                result[index++] = nums[deque.peek()];
            }
        }
        return result;
    }
}
