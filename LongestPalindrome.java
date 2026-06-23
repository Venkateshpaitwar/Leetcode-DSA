// 409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int length = 0;
        boolean hasOdd = false;
        for(int count : freq.values()){
            if(count % 2 == 0){
                length += count;
            }else{
                length += count -1;
                hasOdd = true;
            }
        }
        return hasOdd ? length + 1 : length;
    }
}