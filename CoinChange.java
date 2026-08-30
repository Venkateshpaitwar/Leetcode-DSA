// 322. Coin Change
// Memoization 
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

// Tabulation
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] prev = new int[amount + 1];
        int[] curr = new int[amount + 1];

        for (int target = 0; target <= amount; target++) {
            if (target % coins[0] == 0) {
                prev[target] = target / coins[0];
            } else {
                prev[target] = Integer.MAX_VALUE;
            }
        }

        for (int ind = 1; ind < coins.length; ind++) {
            for (int target = 0; target <= amount; target++) {
                int notTake = prev[target];
                int take = Integer.MAX_VALUE;

                if (coins[ind] <= target) {
                    int result = curr[target - coins[ind]];

                    if (result != Integer.MAX_VALUE) {
                        take = 1 + result;
                    }
                }

                curr[target] = Math.min(take, notTake);
            }
            prev = curr;
            curr = new int[amount + 1];
        }
        return prev[amount] == Integer.MAX_VALUE ? -1 : prev[amount];
    }
}
