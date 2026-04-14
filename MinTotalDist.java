//2463. Minimum Total Distance Traveled

import java.util.*;
class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a,b) -> a[0] - b[0]);
        int m = robot.size();
        int n = factory.length;
        long[][] dp = new long[m + 1][n + 1];
        for(int i = 0; i <= m; i++){
            Arrays.fill(dp[i], Long.MAX_VALUE / 2);
        }
        dp[0][0] = 0;
        for(int j = 1; j <= n; j++){
            int pos = factory[j-1][0];
            int cap = factory[j - 1][1];
            for(int i = 0; i <= m; i++){
                dp[i][j] = dp[i][j-1];
                long dist = 0;
                for(int k = 1; k <= cap && k <= i; k++){
                    dist += Math.abs(robot.get(i - k) - pos);
                    dp[i][j] = Math.min(dp[i][j], dp[i - k][j - 1] + dist);
                }
            }
        }
        return dp[m][n];
    }
}