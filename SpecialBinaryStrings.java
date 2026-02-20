//761. Special Binary String

import java.util.*;

class Solution {
    public String makeLargestSpecial(String s) {
        List<String> list = new ArrayList<>();
        int count = 0, start = 0;
        
        // Step 1: Split into primitive special substrings
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
            else count--;
            
            if (count == 0) {
                // Recursively process inner substring
                String inner = s.substring(start + 1, i);
                String processed = makeLargestSpecial(inner);
                list.add("1" + processed + "0");
                start = i + 1;
            }
        }
        
        // Step 2: Sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        
        // Step 3: Concatenate
        StringBuilder result = new StringBuilder();
        for (String str : list) {
            result.append(str);
        }
        
        return result.toString();
    }
}