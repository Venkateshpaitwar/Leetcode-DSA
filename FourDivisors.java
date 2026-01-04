// 1390. Four Divisors

class Solution {
public int sumFourDivisors(int[] nums) {
        int FinalAns = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int ans = 0;
            for(int j = 1; j <= Math.sqrt(nums[i]); j++){
                if (nums[i] % j == 0) { 
                    count++;
                    ans = ans + j;
                    if (j != nums[i] / j) {
                        count++;
                        ans = ans + (nums[i] / j);
                    }
                }
            }
            if(count == 4){
                FinalAns = FinalAns + ans;
            }
        }
        return FinalAns;
    }
}


