// 3014. Minimum Number of Pushes to Type Word I

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int ans = 0;
        int count = 0;
        for (int i = 25; i >= 0 && freq[i] > 0; i--) {
            ans += freq[i] * (count / 8 + 1);
            count++;
        }
        return ans;
    }
}