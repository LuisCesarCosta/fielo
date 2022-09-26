package br.com.fielo;

public class MonkeyIsland {

    public static int findMaxPath(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        for (int j = grid[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < grid.length; i++) {
                if (j == grid[0].length - 1) {
                    dp[i][j] = grid[i][j];
                } else if (i == 0) {
                    dp[i][j] = grid[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == grid.length - 1) {
                    dp[i][j] = grid[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = grid[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1]));
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i][0] > max) {
                max = dp[i][0];
            }
        }

        return max;
    }
}