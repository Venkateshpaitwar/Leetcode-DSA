// 961. N-Repeated Element in Size 2N Array

class Solution {
    public int repeatedNTimes(int[] nums) {
        int maxValue = 10000;
        int[] count = new int[maxValue];

        for(int num: nums){
            count[num] += 1;
            if(count[num] == nums.length / 2){
                return num;
            }
        }
        return -1;
    }
}