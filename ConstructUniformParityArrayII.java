// 3876. Construct Uniform Parity Array II

class Solution {
    public boolean uniformArray(int[] nums1) {
        int mn = Integer.MAX_VALUE;
        boolean hasOdd = false;
        for (int x : nums1) {
            if (x % 2 != 0) {
                hasOdd = true;
                mn = Math.min(mn, x);
            }
        }

        if (!hasOdd) {
            return true;
        }

        for (int x : nums1) {
            if (x % 2 == 0 && x < mn) {
                return false;
            }
        }
        return true;
    }
}