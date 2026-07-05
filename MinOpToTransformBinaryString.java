// 3980. Minimum Operations to Transform Binary String

class Solution {
    public int minOperations(String sIn, String tIn) {
        if (sIn.equals(tIn)) return 0;
        char[] s = sIn.toCharArray();
        char[] t = tIn.toCharArray();
        int ans = 0;
        int n = s.length;
        for (int i = 0; i < n; i++) {
            if (s[i] == t[i]) continue;
            if (s[i] == '0') {                  
                s[i] = '1';
                ans++;
                continue;
            }
            // pair with a right '1'
            if (i + 1 < n && s[i + 1] == '1') { 
                s[i + 1] = '0';
                s[i] = '0';
                ans++;
                continue;
            }
             // pair with left '1', then restore it
            if (i - 1 >= 0 && s[i - 1] == '1') {
                s[i] = t[i];
                ans += 1;
                ans += (t[i - 1] == '1') ? 1 : 0;
                s[i - 1] = t[i - 1];
                continue;
            }
            // create a right '1' first
            if (i + 1 < n && s[i + 1] == '0') { 
                s[i] = t[i];
                ans += 2;
                ans += (t[i + 1] == '1') ? 1 : 0;
                s[i + 1] = t[i + 1];
                continue;
            }
            // create a left '1' first
            if (i - 1 >= 0 && s[i - 1] == '0') { 
                s[i] = t[i];
                ans += 2;
                ans += (t[i - 1] == '1') ? 1 : 0;
                s[i - 1] = t[i - 1];
                continue;
            }
        }
        if (!new String(s).equals(new String(t))) return -1;
        return ans;
    }
}