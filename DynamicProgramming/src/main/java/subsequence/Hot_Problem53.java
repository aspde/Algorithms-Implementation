package subsequence;

/**
 * 最大子数组和
 */
public class Hot_Problem53 {

    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            result = Math.max(dp[i], result);
        }
        return result;
    }
}
