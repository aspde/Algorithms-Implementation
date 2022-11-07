/**
 * 有效的字母异位词，利用数组下标
 */
public class Program242 {

    public boolean isAnagram(String s, String t) {

        int[] record = new int[26];

        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }

        for (int i : record) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
