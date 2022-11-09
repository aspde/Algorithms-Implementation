/**
 * 搜索插入位置 二分查找法 时间复杂度为 O(log n)
 * 当left > right时循环失效
 */
public class Program35 {

    public int searchInsert(int[] nums, int target) {

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
        return right + 1;
    }
}
