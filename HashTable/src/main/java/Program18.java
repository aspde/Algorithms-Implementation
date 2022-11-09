import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和
 */
public class Program18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        // 对数组排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] >= 0 && nums[i] > target) {
                return result;
            }
            // 对i去重
            if(i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {

                if(nums[j] >= 0 && nums[i] + nums[j] > target) {
                    return result;
                }
                // 对j去重
                if(j > i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;

                while(left < right) {

                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
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
        }

        return result;
    }
}
