// 1979. Find Greatest Common Divisor of Array

class Solution {
    public int findGCD(int[] nums) {
        int min = 1001;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return gcd(max, min);
    }
    private int gcd(int a, int b){
         while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}