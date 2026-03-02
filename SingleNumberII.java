// 137. Single Number II 
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i+=3){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
// class Solution {
//   public int singleNumber(int[] nums) {
//     int ans = 0;

//     for (int i = 0; i < 32; ++i) {
//       int sum = 0;
//       for (final int num : nums)
//         sum += num >> i & 1;
//       sum %= 3;
//       ans |= sum << i;
//     }

//     return ans;
//   }
// }

// class Solution {
//     public int singleNumber(int[] nums) {
//         int ones = 0, twos = 0;
//         for(int num : nums){
//             ones = (ones ^ num) & ~twos;
//             twos = (twos ^ num) & ~ones;
//         }
//         return ones;
//     }
// }