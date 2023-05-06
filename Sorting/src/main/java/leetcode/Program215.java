package leetcode;

/**
 * 数组中的第K个最大元素
 */
public class Program215 {

    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int left = 0;
        int right = nums.length - 1;

        while(true) {
            int pivot = randomPartition(nums, left, right);
            if(pivot > target) {
                right = pivot - 1;
            } else if (pivot < target) {
                left = pivot + 1;
            } else {
                return nums[pivot];
            }
        }
    }

    private int randomPartition(int[] array, int left, int right) {
        int randomIndex = left + (int) (Math.random() * (right - left + 1));
        swap(array, randomIndex, left);
        return partition(array, left, right);
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left + 1;
        int j = right;

        while(i <= j) {
            while(i <= right && array[i] < pivot) {
                ++i;
            }
            while(j >= left + 1 && pivot < array[j]) {
                --j;
            }
            if(i <= j) {
                swap(array, i, j);
                ++i;
                --j;
            }
        }
        swap(array, left, j);
        return j;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
