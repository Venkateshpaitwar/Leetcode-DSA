// 38. Count and Say

class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int k = 1; k < n; k++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            for (int i = 1; i <= s.length(); i++) {
                if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                    count++;
                } else {
                    next.append(count);
                    next.append(s.charAt(i - 1));
                    count = 1;
                }
            }
            s = next.toString();
        }
        return s;
    }
}