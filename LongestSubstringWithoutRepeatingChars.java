// 3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int indexl = 0;
        int indexr = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(indexr != s.length()){
            if(map.containsKey(s.charAt(indexr))){
                int oldindex = map.get(s.charAt(indexr));
                indexl = Math.max(indexl, oldindex + 1);
            }
            map.put(s.charAt(indexr), indexr);
            int length = indexr - indexl + 1;
            maxLength = Math.max(length, maxLength);
            indexr++;
        }
        return maxLength;
    }
}