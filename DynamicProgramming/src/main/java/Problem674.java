import java.util.Arrays;

/**
 * 最长连续递增序列
 */
public class Problem674 {

    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i - 1] < nums[i]) {
                dp[i] = dp[i - 1] + 1;
            }
            result = Math.max(dp[i], result);
        }
        return result;
    }
}