package subsequence;

/**
 * 回文子串
 */
public class Problem647 {

    public int countSubstrings(String s) {
        int result = 0;
        int size = s.length();
        boolean[][] dp = new boolean[size][size];

        for (int i = size - 1; i >= 0; i--) {
            for (int j = i; j < size; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(j - i <= 2) {
                        dp[i][j] = true;
                        result++;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                        if(dp[i][j]) {
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }
}
