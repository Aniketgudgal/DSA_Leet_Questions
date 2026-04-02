class Solution {
    int m, n;
    int[][] coins;
    Integer[][][] dp;
    public int maximumAmount(int[][] coins) {
        this.coins = coins;
        this.m = coins.length;
        this.n = coins[0].length;
        dp = new Integer[m][n][3];
        return solve(0, 0, 2);
    }
    
    public int solve(int i, int j, int k) {
        if (i >= m || j >= n) {
            return Integer.MIN_VALUE;
        }
        if (i == m - 1 && j == n - 1) {
            if (coins[i][j] >= 0) {
                return coins[i][j];
            } else {
                if (k > 0) {
                    return 0;
                } else {
                    return coins[i][j];
                }
            }
        }
        if(dp[i][j][k] != null)
        {
            return dp[i][j][k];
        }
        int val = coins[i][j];
        int ans = Integer.MIN_VALUE;

        int right = solve(i, j + 1, k);
        int down = solve(i + 1, j, k);
        int bestNext = Math.max(right, down);
        if (bestNext != Integer.MIN_VALUE) {
            ans = Math.max(ans, val + bestNext);
        }

        if (val < 0 && k > 0) {
            int right2 = solve(i, j + 1, k - 1);
            int down2 = solve(i + 1, j, k - 1);
            int bestNext2 = Math.max(right2, down2);
            if (bestNext2 != Integer.MIN_VALUE) {
                ans = Math.max(ans, bestNext2);
            }
        }
        return dp[i][j][k] = ans;
    }
}