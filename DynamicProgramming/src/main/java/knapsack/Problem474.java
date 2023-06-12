package knapsack;

/**
 * 一和零
 */
public class Problem474 {

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int zeroNum;
        int oneNum;
        for (int i = 0; i < strs.length; i++) {
            zeroNum = 0;
            oneNum = 0;
            for(char ch : strs[i].toCharArray()) {
                if(ch == '0') {
                    zeroNum++;
                } else {
                    oneNum++;
                }
            }
            for (int j = m; j >= zeroNum; j--) {
                for (int k = n; k >= oneNum; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zeroNum][k - oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
