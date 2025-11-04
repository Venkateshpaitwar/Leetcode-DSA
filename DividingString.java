//2138. Divide a String Into Groups of Size k

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int groups = (n + k - 1) / k;  
        String[] ans = new String[groups];
        int idx = 0;

        for (int i = 0; i < n; i += k) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                if (j < n) sb.append(s.charAt(j));
                else sb.append(fill);
            }
            ans[idx++] = sb.toString();
        }

        return ans;
    }
}
