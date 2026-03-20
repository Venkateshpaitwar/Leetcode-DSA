//213. House Robber II

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] first = new int[n-1];
        int[] last = new int[n-1];
        if(n == 1){
            return nums[0];
        }
        for(int i = 0; i < n - 1; i++){
            first[i] = nums[i];
        }
        for(int i = 1; i < n; i++){
            last[i-1] = nums[i];
        }
        return Math.max(solve(first), solve(last));
    }
    private int solve(int[] nums){
        int prev1 = 0;
        int prev2 = 0;

        for(int num : nums){
            int take = num + prev2;
            int skip = prev1;
            int curr = Math.max(take, skip);

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}