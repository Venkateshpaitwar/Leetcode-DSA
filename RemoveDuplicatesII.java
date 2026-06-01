//80. Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2){
            return n;
        }
        int prev = 2;
        for(int curr = 2; curr < n; curr++){
            if(nums[curr] != nums[prev - 2]){
                nums[prev] = nums[curr];
                prev++;
            }
        }
        return prev;
    }
}