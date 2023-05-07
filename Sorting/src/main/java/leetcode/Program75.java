package leetcode;

/**
 * 颜色分类
 */
public class Program75 {

    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i <= right; i++) {
            while(i <= right && nums[i] == 2) {
                nums[i] = nums[right];
                nums[right] = 2;
                --right;
            }
            if(nums[i] == 0) {
                nums[i] = nums[left];
                nums[left] = 0;
                ++left;
            }
        }
    }
}
