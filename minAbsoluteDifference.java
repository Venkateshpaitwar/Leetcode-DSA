// 3880. Minimum Absolute Difference Between Two Values

class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int oneIndex = -1;
        int twoIndex = -1;
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                oneIndex = i;
                if(twoIndex != -1){
                    minDiff = Math.min(minDiff, Math.abs(oneIndex - twoIndex));
                }
            }
            else if(nums[i] == 2){
                twoIndex = i;
                if(oneIndex != -1){
                    minDiff = Math.min(minDiff, Math.abs(oneIndex - twoIndex));
                }
            }
        }
        if(oneIndex == -1 || twoIndex == -1){
            minDiff = -1;
        }
        return minDiff;
    }
}