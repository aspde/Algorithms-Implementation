
/**
 * 不同路径 II
 */
public class Program63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        dp[0][0] = 1;
        for (int i = 1; i < m && obstacleGrid[i][0] != 1; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j < n && obstacleGrid[0][j] != 1; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = obstacleGrid[i][j] != 1 ? dp[i - 1][j] + dp[i][j - 1] : 0;
            }
        }
        return dp[m - 1][n - 1];
    }
}
