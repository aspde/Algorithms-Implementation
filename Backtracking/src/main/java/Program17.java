import java.util.ArrayList;
import java.util.List;

/**
 * 电话号码的字母组合
 */
public class Program17 {

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.equals("")) {
            return result;
        }
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTracking(numString, digits, 0);
        return result;
    }

    StringBuilder temp = new StringBuilder();

    private void backTracking(String[] numString, String digits, int num) {

        if(num == digits.length()) {
            result.add(temp.toString());
            return;
        }

        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i <= str.length(); i++) {
            temp.append(str.charAt(i));
            backTracking(numString, digits, num + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
