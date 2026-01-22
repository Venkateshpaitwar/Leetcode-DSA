// 2535. Difference Between Element Sum and Digit Sum of an Array

class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int secondSum = 0;
        for(int i = 0; i < nums.length; i++){
            secondSum += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            while(nums[i] > 0){
                sum += nums[i]%10;
                nums[i]/=10;
            }
        }
        return secondSum - sum;
    }
}