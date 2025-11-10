// 1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];
        
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        
        return result;
    }
}
