
/**
 * 搜索旋转排序数组 II
 */
public class Problem81 {

    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int middle;
        while(left <= right) {
            middle = left + ((right - left) >> 1);
            if(nums[middle] == target) {
                return true;
            }

            if (nums[left] == nums[middle]) {
                left++;
                continue;
            }
            if(nums[middle] >= nums[left]) {
                if(target >= nums[left] && target < nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if(target > nums[middle] && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return false;
    }
}
