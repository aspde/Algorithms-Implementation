package house_robber;

/**
 * 打家劫舍 II
 */
public class Problem213 {

    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int result1 = robHelper(nums, 0, nums.length - 2);
        int result2 = robHelper(nums, 1, nums.length - 1);
        return Math.max(result1, result2);
    }

    private int robHelper(int[] nums, int start, int end) {
        if(start == end) {
            return nums[start];
        }
        int[] dp = new int[end + 1];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[end];
    }
}
