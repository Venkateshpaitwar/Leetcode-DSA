// 2091. Removing Minimum and Maximum From Array

class Solution {
    public int minimumDeletions(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int imax = 0;
        int imin = 0;
        int ans = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                imin = i;
            }else if(nums[i] > max){
                max = nums[i];
                imax = i;
            }
        }
        
        int left = Math.max(imin, imax) + 1;
        int right = nums.length - Math.min(imin, imax);
        int both = Math.min(imin, imax) + 1
                 + nums.length - Math.max(imin, imax);

        return Math.min(left, Math.min(right, both));
    }
}