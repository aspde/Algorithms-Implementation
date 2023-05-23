package subsequence;

/**
 * 最长回文子串
 */
public class Hot_Problem5 {

    public String longestPalindrome(String s) {
        int size = s.length();
        boolean[][] dp = new boolean[size][size];
        int maxLength = 0;
        int left = 0;

        for (int i = 0; i < size; i++) {
            dp[i][i] = true;
        }

        for (int i = size - 1; i >= 0; i--) {
            for (int j = i; j < size; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(j - i <= 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if(dp[i][j] && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    left = i;
                }
            }
        }
        return s.substring(left, left + maxLength);
    }
}
