class Solution {

    int solveRec(int[] coins, int n, int sum) {
        if (sum == 0) return 1;
        if (sum < 0) return 0;
        if (n == 0) return 0;

        int exclude = solveRec(coins, n - 1, sum);
        int include = solveRec(coins, n, sum - coins[n - 1]);

        return exclude + include;
    }

    int solveMem(int[] coins, int n, int sum, int[][] dp) {
        if (sum == 0) return 1;
        if (sum < 0) return 0;
        if (n == 0) return 0;

        if (dp[n][sum] != -1)
            return dp[n][sum];

        int exclude = solveMem(coins, n - 1, sum, dp);
        int include = solveMem(coins, n, sum - coins[n - 1], dp);

        dp[n][sum] = exclude + include;

        return dp[n][sum];
    }

    int solveTab(int[] coins, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                int exclude = dp[i - 1][j];

                int include = 0;

                if (coins[i - 1] <= j) {
                    include = dp[i][j - coins[i - 1]];
                }

                dp[i][j] = exclude + include;
            }
        }

        return dp[n][sum];
    }

    public int change(int amount, int[] coins) {
        int n = coins.length;

        return solveTab(coins, n, amount);
    }
}
