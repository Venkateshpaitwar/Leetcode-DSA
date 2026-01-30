// 500. Keyboard Row
import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : "qwertyuiop".toCharArray()) map.put(c, 1);
        for (char c : "asdfghjkl".toCharArray()) map.put(c, 2);
        for (char c : "zxcvbnm".toCharArray()) map.put(c, 3);
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lower = word.toLowerCase();
            int row = map.get(lower.charAt(0));
            
            boolean valid = true;
            for (char c : lower.toCharArray()) {
                if (map.get(c) != row) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) result.add(word);
        }
        
        return result.toArray(new String[0]);
    }
}
