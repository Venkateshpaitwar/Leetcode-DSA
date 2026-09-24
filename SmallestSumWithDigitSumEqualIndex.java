//3550. Smallest Index With Digit Sum Equal to Index

class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(digitSum(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
    private int digitSum(int num){
        int sum = 0;
        while(num != 0){
            int d = num % 10;
            sum += d;
            num = num / 10;
        }
        return sum;
    }
}