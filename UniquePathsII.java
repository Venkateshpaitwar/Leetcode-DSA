// 63. Unique Paths II

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        return countPathsExcludingObstacle(obstacleGrid, dp, m-1, n-1);
    }

    private int countPathsExcludingObstacle(int[][] arr, int[][] dp, int i, int j){
        if(i >= 0 && j >= 0 && arr[i][j] == 1) return 0;
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int up = countPathsExcludingObstacle(arr, dp, i-1, j);
        int left = countPathsExcludingObstacle(arr, dp, i, j-1);
        return dp[i][j] = up + left;
    }

}