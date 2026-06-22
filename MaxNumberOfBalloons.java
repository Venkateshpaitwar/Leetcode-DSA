// 1189. Maximum Number of Balloons

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for(char c : text.toCharArray()){
            freq[c - 'a']++;
        }
        return Math.min( 
            Math.min(freq[0],freq[1]), Math.min(freq[13], Math.min(freq[11] / 2, freq[14] / 2)));
    }
}