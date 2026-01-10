//416. Partition Equal Subset Sum

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
