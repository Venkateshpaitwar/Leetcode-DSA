//3300. Minimum Element After Replacement With Digit Sum

class Solution {
    public int minElement(int[] nums) {
        int arr[] = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            while(nums[i] != 0){
                sum += nums[i] % 10;
                nums[i] = nums[i]/10;
            }
            arr[i] = sum;
            min = Math.min(sum, min);
        }
        return min;
    }
}