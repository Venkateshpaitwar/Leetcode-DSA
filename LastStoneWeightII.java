// 1049. Last Stone Weight II

class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum / 2;
        boolean[] prev = new boolean[target + 1];
        prev[0] = true;
        if (stones[0] <= target) {
            prev[stones[0]] = true;
        }
        for (int i = 1; i < stones.length; i++) {
            boolean[] curr = new boolean[target + 1];
            curr[0] = true;
            for (int k = 1; k <= target; k++) {
                boolean notTake = prev[k];
                boolean take = false;
                if (stones[i] <= k) {
                    take = prev[k - stones[i]];
                }
                curr[k] = take || notTake;
            }
            prev = curr;
        }
        for (int s1 = target; s1 >= 0; s1--) {
            if (prev[s1]) {
                int s2 = sum - s1;
                return s2 - s1;
            }
        }
        return 0;
    }
}