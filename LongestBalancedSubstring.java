// 3713. Longest Balanced Substring I
import java.util.*;
class Solution {
    public int longestBalanced(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = i; j < n; j++){
                Character ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (!map.isEmpty()) {
                    Integer firstValue = map.values().iterator().next();
                    boolean allSame = true;
                    for (Integer value : map.values()) {
                        if (!value.equals(firstValue)) {
                            allSame = false;
                            break;
                        }   
                    }
                    if (allSame) {
                        list.add(j-i+1);
                    }
                }
            }
        }
        int maxLen = Collections.max(list);
        return maxLen;
    }
}