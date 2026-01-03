//1411. Number of Ways to Paint N × 3 Grid

class Solution {
    public int numOfWays(int n) {
        int MOD = 1_000_000_007;

        long a = 6; // ABC
        long b = 6; // ABA

        if (n == 1) {
            return 12;
        }

        while (n != 1) {
            long first = (a * 2 + b * 2) % MOD;
            long second = (a * 2 + b * 3) % MOD;
            a = first;
            b = second;
            n--;
        }

        return (int)((a + b) % MOD);
    }
}
