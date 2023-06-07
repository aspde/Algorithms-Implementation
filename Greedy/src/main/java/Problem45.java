
/**
 * 跳跃游戏 II
 */
public class Problem45 {

    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int count = 0;
        int curDistance = 0;
        int maxDistance = 0;

        for (int i = 0; i <= curDistance; i++) {
            maxDistance = Math.max(i + nums[i], maxDistance);
            if(maxDistance >= nums.length - 1) {
                count++;
                break;
            }
            if(i == curDistance) {
                curDistance = maxDistance;
                count++;
            }
        }
        return count;
    }
}
