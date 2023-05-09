
/**
 * 删除字符串中的所有相邻重复项
 */
public class Program1047 {

    public String removeDuplicates(String s) {
        // 使用StringBuffer作为栈
        StringBuffer res = new StringBuffer();
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (top >= 0 && res.charAt(top) == c) {
                res.deleteCharAt(top);
                top--;
            } else {
                res.append(c);
                top++;
            }
        }
        return res.toString();
    }
}
