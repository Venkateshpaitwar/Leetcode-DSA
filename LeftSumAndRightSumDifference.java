//2574. Left and Right Sum Differences

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] answer = new int[nums.length];
        int left = 0; 
        for(int i = 1; i <= nums.length; i++){
            leftsum[i - 1] = left;
            left += nums[i - 1];
        }
        for(int i = 0; i < nums.length; i++){
            rightsum[i] = left - nums[i];
            left -= nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            answer[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return answer;
    }
}