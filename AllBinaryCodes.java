// 1461. Check If a String Contains All Binary Codes of Size K
import java.util.HashSet;
class Solution {
    public boolean hasAllCodes(String s, int k) {
        double setSize = Math.pow(2,k);
        HashSet <String> set = new HashSet<>();
        for(int i = 0; i <= s.length()-k; i++){
            set.add(s.substring(i, i+k));
            if(set.size() == setSize){
                return true;
            }
        }
        return false;
    }
}