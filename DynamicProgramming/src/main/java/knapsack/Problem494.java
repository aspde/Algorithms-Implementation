package knapsack;

/**
 * 目标和
 */
public class Problem494 {

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if(sum < Math.abs(target)) {
            return 0;
        }
        if((target + sum) % 2 == 1) {
            return 0;
        }
        int bagSize = (target + sum) / 2;

        int[] dp = new int[bagSize + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagSize; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[bagSize];
    }
}
