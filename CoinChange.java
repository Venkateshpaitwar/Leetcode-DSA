// 322. Coin Change

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int ans = countCoins(coins.length - 1, amount, coins, dp);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
    private int countCoins(int ind, int target, int[] coins, int[][] dp){
        if(ind == 0){
            if(target % coins[ind] == 0) return target/coins[ind];
            else return Integer.MAX_VALUE;
        }
        if(dp[ind][target] != -1){
            return dp[ind][target];
        }
        int notTake = countCoins(ind - 1, target, coins, dp);
        int take = Integer.MAX_VALUE;
        if(coins[ind] <= target){
            int result = countCoins(ind, target - coins[ind], coins, dp);
            if(result != Integer.MAX_VALUE){
                take = 1 + result;
            }
        }
        return dp[ind][target] = Math.min(take, notTake);
    }
}