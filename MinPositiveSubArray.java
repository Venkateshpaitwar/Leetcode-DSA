// 3364. Minimum Positive Sum Subarray 

import java.util.*;
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        for (int length = l; length <= r; length++) {
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += nums.get(i);
            }
            if (sum > 0) {
                ans = Math.min(ans, sum);
            }
            for (int i = length; i < nums.size(); i++) {
                sum += nums.get(i);
                sum -= nums.get(i - length);
                if (sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}