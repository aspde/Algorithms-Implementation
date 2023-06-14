package subsequence;

/**
 * 乘积最大子数组
 */
public class Problem152 {

    public int maxProduct(int[] nums) {
        int[] maxDp = new int[nums.length];
        int[] minDp = new int[nums.length];
        maxDp[0] = nums[0];
        minDp[0] = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxDp[i] = Math.max(nums[i], Math.max(maxDp[i - 1] * nums[i], minDp[i - 1] * nums[i]));
            minDp[i] = Math.min(nums[i], Math.min(minDp[i - 1] * nums[i], maxDp[i - 1] * nums[i]));
            result = Math.max(result, maxDp[i]);
        }
        return result;
    }
}
