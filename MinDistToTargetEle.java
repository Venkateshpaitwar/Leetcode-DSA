// 1848. Minimum Distance to the Target Element

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDist = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                minDist = Math.min(minDist, Math.abs(i - start));
            }
        } 
        return minDist;
    }
}