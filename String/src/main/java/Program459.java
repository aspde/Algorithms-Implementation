
/**
 * 重复的子字符串
 */
public class Program459 {

    public boolean repeatedSubstringPattern(String s) {

        if(s.length() == 0) {
            return false;
        }
        int[] next = new int[s.length()];
        char[] chars = s.toCharArray();
        int j = 0;
        // 填充next数组
        for (int i = 1; i < s.length(); i++) {
            while(j >0 && chars[i] != chars[j]) {
                j = next[j - 1];
            }
            if(chars[i] == chars[j]) {
                j++;
            }
            next[i] = j;
        }
        int size = s.length();
        if(next[size - 1] != 0 && size % (size - next[size - 1]) == 0) {
            return true;
        }
        return false;
    }
}
