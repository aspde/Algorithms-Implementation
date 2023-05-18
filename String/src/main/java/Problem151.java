
/**
 * 反转字符串中的单词
 */
public class Problem151 {

    public String reverseWords(String s) {
        // 去除多余空格
        StringBuilder sb = removeSpace(s);
        // 反转字符串
        reverseString(sb, 0, sb.length() - 1);
        // 反转单词
        reverseEachWord(sb);
        return sb.toString();
    }

    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 0;
        while(start < sb.length()) {
            while(end < sb.length() && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }

    private void reverseString(StringBuilder sb, int start, int end) {
        while(start < end) {
            Character temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    private StringBuilder removeSpace(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while(chars[start] == ' ') {
            start++;
        }
        while(chars[end] == ' ') {
            end++;
        }
        StringBuilder sb = new StringBuilder();
        while(start <= end) {
            if(chars[start] != ' ' || chars[start - 1] != ' ') {
                sb.append(chars[start]);
            }
            start++;
        }
        return sb;
    }
}
