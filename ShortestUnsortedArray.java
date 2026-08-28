// 581. Shortest Unsorted Continuous Subarray

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int maxValue = nums[0];
        int left = -1, right = -1;
        for(int i = 1; i < nums.length; i++){
            maxValue = Math.max(nums[i], maxValue);
            if(nums[i] < maxValue){
                right = i;
            }
        }
        int minValue = nums[nums.length - 1];
        for(int i = nums.length - 1; i >= 0; i--){
            minValue = Math.min(nums[i], minValue);
            if(nums[i] > minValue){
                left = i;
            }
        }
        if(left == -1){
            return 0;
        }
        return right - left + 1;
    }
}