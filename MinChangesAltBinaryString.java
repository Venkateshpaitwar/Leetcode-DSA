// 1758. Minimum Changes To Make Alternating Binary String
class Solution {
    public int minOperations(String s) {
        int zero = 0;
        int ones = 0;
        for(int i = 0 ; i < s.length(); i++){
            char expected0 = (i % 2 == 0) ? '0' : '1';
            char expected1 = (i % 2 == 0) ? '1' : '0';
            if(s.charAt(i) != expected0) zero++;
            if(s.charAt(i) != expected1) ones++;
        }
        return Math.min(zero, ones);
    }
}