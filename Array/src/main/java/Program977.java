
/**
 * 有序数组的平方
 */
public class Program977 {

    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int[] newNums = new int[nums.length];
        for (int z = nums.length - 1; z >= 0; z--) {
            if(nums[i]*nums[i]>nums[j]*nums[j]) {
                newNums[z] = nums[i]*nums[i];
                i++;
            } else {
                newNums[z] = nums[j]*nums[j];
                j--;
            }
        }
        return newNums;
    }
}
