// 3903. Smallest Stable Index I

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int maxValue = Integer.MIN_VALUE;
        int index = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            maxValue = Math.max(maxValue, nums[i]);
            int minValue = Integer.MAX_VALUE;
            for(int j = i; j < n; j++){
                minValue = Math.min(minValue, nums[j]);
            }
            int diff = maxValue - minValue;
            if(diff <= k){
                index = Math.min(index, i);
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }
}