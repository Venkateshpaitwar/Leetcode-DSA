// 1980. Find Unique Binary String

import java.util.*;
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        HashSet <String> set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }
        return backtrack("", n, set);
    }
    private String backtrack(String s,int n, HashSet<String> set){
        if(s.length() == n){
            if(!set.contains(s)){
                return s;
            }
            else{
                return null;
            }
        }
        String withZero = backtrack(s + '0', n, set);
        if(withZero != null) return withZero;
        String withOne = backtrack(s+'1', n, set);
        return withOne;
    }
}