// 3979. Maximum Valid Pair Sum

class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int left = nums[0];
        for(int right = k; right < nums.length; right++){
            left = Math.max(left, nums[right - k]);
            maxSum = Math.max(maxSum, left + nums[right]);
        }
        return maxSum;
    }
}