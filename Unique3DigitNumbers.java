// 3483. Unique 3-Digit Even Numbers

class Solution {
    public int totalNumbers(int[] digits) {
        int[] f = new int[10];
        for (int d : digits) f[d]++;
        int ans = 0;
        for (int a = 1; a <= 9; a++)
            for (int b = 0; b <= 9; b++)
                for (int c = 0; c <= 8; c += 2) {
                    int[] used = new int[10];
                    used[a]++;
                    used[b]++;
                    used[c]++;
                    boolean ok = true;
                    for (int d = 0; d < 10; d++)
                        if (used[d] > f[d]) ok = false;
                    if (ok) ans++;
                }

        return ans;
    }
}