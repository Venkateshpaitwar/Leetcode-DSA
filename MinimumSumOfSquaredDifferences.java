//2333. Minimum Sum of Squared Difference

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        int n = nums1.length;
        long[] diff = new long[n];
        long total = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs((long) nums1[i] - nums2[i]);
            total += diff[i];
            max = Math.max(max, diff[i]);
        }
        if (k >= total) {
            return 0;
        }
        long low = 0, high = max;
        while (low < high) {
            long mid = low + (high - low) / 2;
            long required = 0;
            for (long d : diff) {
                if (d > mid) {
                    required += d - mid;
                }
            }
            if (required <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        long ans = 0;
        long used = 0;
        for (long d : diff) {
            if (d > low) {
                used += d - low;
                d = low;
            }
            ans += d * d;
        }
        long remaining = k - used;
        ans -= remaining * (2 * low - 1);
        return ans;
    }
}