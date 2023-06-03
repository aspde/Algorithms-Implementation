
/**
 * 搜索旋转排序数组
 */
public class Hot_Problem33 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int middle;
        while(left <= right) {
            middle = left + ((right - left) >> 1);
            if(nums[middle] == target) {
                return middle;
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
        return -1;
    }
}
