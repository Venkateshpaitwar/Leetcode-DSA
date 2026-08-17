//416. Partition Equal Subset Sum

/*
class Solution {
    Boolean[][] memo;
    int[] nums;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;

        if (sum % 2 != 0) return false;

        this.nums = nums;
        int target = sum / 2;
        memo = new Boolean[nums.length][target + 1];

        return dfs(0, target);
    }

    private boolean dfs(int i, int remaining) {
        if (remaining == 0) return true;

        if (i == nums.length || remaining < 0) return false;

        if (memo[i][remaining] != null)
            return memo[i][remaining];

        memo[i][remaining] =
                dfs(i + 1, remaining - nums[i]) ||
                dfs(i + 1, remaining);

        return memo[i][remaining];
    }
}
 */

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums) sum += num;
        if(sum % 2 != 0) return false;

        int target = sum / 2;
        boolean[] prev = new boolean[target + 1];
        if(nums[0] <= target){
            prev[nums[0]] = true;
        }
        prev[0] = true;
        for(int i = 1; i < nums.length; i++){
            boolean[] curr = new boolean[target + 1];
            curr[0] = true;        
            for(int k = 1; k < target + 1; k++){
                boolean notTake = prev[k];
                boolean take = false;
                if(nums[i] <= k){
                    take = prev[k - nums[i]];
                } 
                curr[k] = take | notTake;
            }
            prev = curr;
        }
        return prev[target];
    }
}
