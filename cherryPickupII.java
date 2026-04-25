// 1463. Cherry Pickup II 

class Solution {
    private int[][][] dp;
    private int[][] grid;
    private int m, n;
    
    public int cherryPickup(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        dp = new int[m][n][n];

        // initialize with -1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return dfs(0, 0, n - 1);
    }

    private int dfs(int row, int col1, int col2) {
        // boundary check
        if (col1 < 0 || col2 < 0 || col1 >= n || col2 >= n) {
            return 0;
        }
        // memo check
        if (dp[row][col1][col2] != -1) {
            return dp[row][col1][col2];
        }
        // collect cherries
        int cherries = grid[row][col1];
        if (col1 != col2) {
            cherries += grid[row][col2];
        }
        // last row
        if (row == m - 1) {
            return dp[row][col1][col2] = cherries;
        }

        int max = 0;
        // explore all moves (9 possibilities)
        for (int d1 = -1; d1 <= 1; d1++) {
            for (int d2 = -1; d2 <= 1; d2++) {
                max = Math.max(max, dfs(row + 1, col1 + d1, col2 + d2));
            }
        }

        return dp[row][col1][col2] = cherries + max;
    }
}