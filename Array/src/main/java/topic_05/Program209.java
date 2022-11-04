package topic_05;

/**
 * 长度最小的子数组，滑动窗口
 */
public class Program209 {

    public int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int sum = nums[0];
        int result = Integer.MAX_VALUE;

        for (int j = 1; j < nums.length; j++) {
            sum+=nums[j];
            while(sum>=target){
                sum-=nums[i];
                result = Math.min(result, j-i+1);
                i++;
            }
        }
        return result == Integer.MAX_VALUE? 0:result;
    }
}
