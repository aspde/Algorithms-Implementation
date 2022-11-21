
/**
 * 二分查找
 */
public class Program704 {

    // 左闭右闭版本
    public int search1(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            // 防止left + right超出范围，溢出
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

    // 左闭右开版本
    public int search2(int[] nums, int target) {

        int left = 0;
        int right = nums.length;
        while(left < right) {
            int middle = left + ((right - left) >> 1);
            if(nums[middle] < target){
                left = middle + 1;
            } else if(nums[middle] > target) {
                right = middle;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
