// 3974. Maximum Total Sum of K Selected Elements

class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long totalSum = 0;
        int n = nums.length;
        while(k != 0){
            long val = nums[n - 1];
            totalSum += Math.max(val * mul, val);
            k--;
            mul--;
            n--;
        }
        // for(int i = nums.length - 1; i >= 0; i--){
        //     if(k > 0 && mul >= 1){
        //         totalSum += nums[i] * mul;
        //         mul--;
        //         k--;
        //     }    
        //     totalSum += nums[i];
        //     k--;
        // }
        return totalSum;
    }
}