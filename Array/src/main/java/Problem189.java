
/**
 * 轮转数组
 */
public class Problem189 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        int temp;
        for (int i = start, j = end; i < j; i++, j--) {
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}
