package topic_03;

/**
 * 移除元素，双指针法实现
 */
public class Program27 {

    public int removeElement(int[] nums, int val) {

        int slow = 0;
        for(int fast = 0;fast < nums.length;fast++) {
            if(nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
