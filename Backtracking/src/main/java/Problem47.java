import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列 II
 */
public class Problem47 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        Arrays.sort(nums);
        permuteUniqueHelper(nums);
        return result;
    }

    private void permuteUniqueHelper(int[] nums) {
        if(path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            if(used[i]) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            permuteUniqueHelper(nums);
            used[i] = false;
            path.removeLast();
        }
    }
}
