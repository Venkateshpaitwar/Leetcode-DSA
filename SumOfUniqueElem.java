// 1748. Sum of Unique Elements

class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i = 0; i < 101; i++){
            if(freq[i] == 1){
                ans += i;
            }
        }
        return ans;
    }
}