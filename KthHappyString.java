// 1415. The k-th Lexicographical String of All Happy Strings of Length n
import java.util.*;
class Solution {
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        backtrack("", n, list);
        if(k > list.size()) return "";
        return list.get(k-1);
    }
    private void backtrack(String curr, int n, List<String> list){
        if(curr.length() == n){
            list.add(curr);
            return;
        }
        for(char c : new char[] {'a','b','c'}){
            if(curr.length() > 0 && curr.charAt(curr.length() - 1) == c){
                continue;
            }
        backtrack(curr + c,n, list);
        }
    }
}