
/**
 * 替换空格
 */
public class Offer05 {

    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        reverseString(sb, 0, n - 1);
        reverseString(sb, n, sb.length() - 1);
        return sb.reverse().toString();
    }

    private void reverseString(StringBuilder sb, int start, int end) {
        char temp;
        for (int i = start, j = end; i < j; i++, j--) {
            temp = sb.charAt(j);
            sb.setCharAt(j, sb.charAt(i));
            sb.setCharAt(i, temp);
        }
    }
}
