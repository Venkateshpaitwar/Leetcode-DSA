// 3737. Count Subarrays With Majority Element I

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int targetCount = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == target){
                    targetCount++;
                }
                int len = j - i + 1;
                if(targetCount * 2 > len){
                    count++;
                }
            }
        }
        return count;
    }
}