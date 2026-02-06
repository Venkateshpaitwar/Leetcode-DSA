//3634. Minimum Removals to Balance Array
import java.util.*;
class Solution {
    public int minRemoval(int[] nums, int k) {
        int ans = 1;
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        Arrays.sort(nums);
        int j = 0;
        for(int i = 0; i < n; i++){
            while(j<n && nums[j] <= (long) nums[i]*k){
                j++;
            }
            ans = Math.max(ans, j-i);
        }
        return n-ans; 
    }
}
