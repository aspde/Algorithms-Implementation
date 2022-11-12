import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 逆波兰表达式求值
 */
public class Program150 {

    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();
        // 减法，除法要调换顺序
        for (String str : tokens) {
            if(str.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (str.equals("-")) {
                stack.push(-stack.pop() + stack.pop());
            } else if (str.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (str.equals("/")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else {
                stack.push(Integer.valueOf(str));
            }
        }

        return stack.pop();
    }
}
