// 3499. Maximize Active Section with Trade I

class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int totalOnes = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') totalOnes++;
        }

        int ans = totalOnes;
        List<Character> chars = new ArrayList<>();
        List<Integer> lens = new ArrayList<>();
        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            int j = i;
            while (j < n && s.charAt(j) == ch) {
                j++;
            }
            chars.add(ch);
            lens.add(j - i);
            i = j;
        }
        for (int k = 1; k < chars.size() - 1; k++) {
            if (chars.get(k) == '1' &&
                chars.get(k - 1) == '0' &&
                chars.get(k + 1) == '0') {
                int gain = lens.get(k - 1) + lens.get(k + 1);
                ans = Math.max(ans, totalOnes + gain);
            }
        }
        return ans;
    }
}