// 131. Palindrome Partitioning

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        findingPaths(0, s, path, res);
        return res;
    }
    private void findingPaths(int index, String s, List<String> path, List<List<String>> res){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i+1));
                findingPaths(i+1, s, path, res);
                path.remove(path.size()-1);
            }
        }
    }  
    private boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}