
/**
 * 删除有序数组中的重复项 II
 */
public class Problem80 {

    public int removeDuplicates(int[] nums) {
        int slow = 2;
        int fast = 2;
        while(fast < nums.length) {
            if(nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
