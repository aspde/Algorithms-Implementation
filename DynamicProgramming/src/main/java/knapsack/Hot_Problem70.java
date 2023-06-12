package knapsack;

/**
 * 爬楼梯
 */
public class Hot_Problem70 {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * follow up : 一步一个台阶，两个台阶，三个台阶，.......，直到 m个台阶。问有多少种不同的方法可以爬到楼顶呢？
     */
    public int climbStairs2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int m = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i >= j) {
                    dp[i] += dp[i - j];
                }
            }
        }
        return dp[n];
    }
}
