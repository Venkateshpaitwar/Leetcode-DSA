//3727. Maximum Alternating Sum of Squares

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(i < n/2){
                ans -= nums[i] * nums[i]; 
            }else{
                ans += nums[i] * nums[i];
            }
        }
        return ans;
    }
}