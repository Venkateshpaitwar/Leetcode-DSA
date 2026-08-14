// 3090. Maximum Length Substring With Two Occurrences

class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] characters = new int[26];
        int j = 0;

        for(int i = 0; i < n; i++){
            int current = s.charAt(i) - 'a';
            characters[current]++;
            while(characters[current] > 2){
                characters[s.charAt(j) - 'a']--;
                j++;
            }
            maxLength = Math.max(maxLength, i - j + 1);
        }
        return maxLength;
    }
}