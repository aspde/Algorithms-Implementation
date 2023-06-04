
/**
 * 赎金信
 */
public class Problem383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] record = new int[26];

        for(char c : magazine.toCharArray()) {
            record[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
            record[c - 'a']--;
        }

        for (int i : record) {
            if(i < 0) {
                return false;
            }
        }
        return true;
    }
}
