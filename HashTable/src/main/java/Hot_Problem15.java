import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 */
public class Hot_Problem15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // 对i剪枝
            if(nums[i] > 0) {
                break;
            }
            // 对i去重
            if(i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0) {
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 对left去重
                    while(left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // 对right去重
                    while(left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}
