
/**
 * 删除有序数组中的重复项
 */
public class Problem26 {

    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int fast = 1;
        while(fast < nums.length) {
            if(nums[fast] != nums[slow - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
