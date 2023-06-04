
/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class Problem34 {

    public int[] searchRange(int[] nums, int target) {
        int index = binarySearch(nums, target);
        if(index == -1) {
            return new int[] {-1, -1};
        }

        int left = index;
        int right = index;
        while(left - 1 >= 0 && nums[left - 1] == target) {
            left--;
        }
        while(right + 1 < nums.length && nums[right + 1] == target) {
            right++;
        }
        return new int[] {left, right};
    }

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int middle = left + ((right - left) >> 1);
            if(nums[middle] < target){
                left = middle + 1;
            } else if(nums[middle] > target) {
                right = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
