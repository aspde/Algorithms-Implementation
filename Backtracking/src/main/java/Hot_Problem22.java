import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 */
public class Hot_Problem22 {

    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        backtracking(sb, 0, 0, n);
        return result;
    }

    private void backtracking(StringBuilder sb, int left, int right, int n) {
        if(left == n && right == n) {
            result.add(sb.toString());
            return;
        }

        if(right > left) {
            return;
        }
        if(left < n) {
            sb.append("(");
            backtracking(sb, left + 1, right, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(right < n) {
            sb.append(")");
            backtracking(sb, left, right + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
