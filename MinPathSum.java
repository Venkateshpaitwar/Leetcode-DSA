// 64. Minimum Path Sum

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        return minCostSum(m-1, n-1, grid, dp);
    }
    private int minCostSum(int i, int j, int[][] grid, int[][] dp){
        if(i == 0 && j == 0) return grid[0][0];
        if(i < 0 || j < 0) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];
        int up =  minCostSum(i-1, j, grid, dp);
        int left = minCostSum(i, j-1, grid, dp);
        int min = Math.min(up, left);
        if(min == Integer.MAX_VALUE) return dp[i][j] = Integer.MAX_VALUE;
        return dp[i][j] = grid[i][j] + min;
    }
}