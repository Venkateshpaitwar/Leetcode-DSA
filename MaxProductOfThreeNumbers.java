// 628. Maximum Product of Three Numbers

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;
        maxProd = Math.max((nums[n-1] * nums[n-2] * nums[n-3]), (nums[0] * nums[1] * nums[n - 1]));
        return maxProd;
    }
}