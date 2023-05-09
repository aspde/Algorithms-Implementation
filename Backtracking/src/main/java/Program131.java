import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 分割回文串
 */
public class Program131 {

    List<List<String>> result = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backtracking(s, 0);
        return result;
    }

    private void backtracking(String s, int startIndex) {
        if(startIndex >= s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if(isPalindrome(s, startIndex, i)) {
                path.add(s.substring(startIndex, i + 1));
            } else {
                continue;
            }
            backtracking(s, i + 1);
            path.removeLast();
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
