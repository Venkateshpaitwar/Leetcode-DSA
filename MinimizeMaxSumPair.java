//1877. Minimize Maximum Pair Sum in Array

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0 ; i < nums.length / 2; i++){
            int sum = nums[i] + nums[nums.length - i - 1];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}