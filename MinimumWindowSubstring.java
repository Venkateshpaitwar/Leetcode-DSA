// 76. Minimum Window Substring

class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int minLength = Integer.MAX_VALUE;
        int count = 0;
        int l = 0;
        int start = -1;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (map.containsKey(c)) {
                if (map.get(c) > 0) {
                    count++;
                }
                map.put(c, map.get(c) - 1);
            }
            while (count == t.length()) {
                if (r - l + 1 < minLength) {
                    minLength = r - l + 1;
                    start = l;
                }
                char leftChar = s.charAt(l);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }
                l++;
            }
        }
        return start == -1 ? "" : s.substring(start, start + minLength);
    }
}
