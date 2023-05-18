import java.util.Deque;
import java.util.LinkedList;

/**
 * 有效的括号
 */
public class Problem20 {

    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (Character ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.peek() == ch) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
