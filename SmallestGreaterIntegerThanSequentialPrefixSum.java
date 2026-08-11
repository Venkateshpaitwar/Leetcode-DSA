//2996. Smallest Missing Integer Greater Than Sequential Prefix Sum

class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }else{
                break;
            }
        }
        while (true) {
            boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == sum) {
                    found = true;
                    sum++;
                    break;
                }
            }
            if (!found) {
                return sum;
            }
        }
    }
}