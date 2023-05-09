import java.util.ArrayList;
import java.util.List;

/**
 * 组合总和III
 */
public class Program216 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, n, 1, 0);
        return result;
    }

    private void backtracking(int k, int targetSum, int startIndex, int sum) {
        if(sum > targetSum) {
            return;
        }
        if(sum == targetSum && path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracking(k, targetSum, i + 1, sum + i);
            path.remove(path.size() - 1);
        }
    }
}
