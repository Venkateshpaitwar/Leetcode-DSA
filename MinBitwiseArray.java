// 3314. Construct The Minimum Bitwise Array I
import java.util.List;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            int t = 0;
            int temp = num;
            while ((temp & 1) == 1) {
                t++;
                temp >>= 1;
            }
            if (t == 0) {
                ans[i] = -1;
            } else {
                ans[i] = num - (1 << (t - 1));
            }
        }
        return ans;
    }
}
