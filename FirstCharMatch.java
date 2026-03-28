// 3884. First Matching Character From Both Ends

class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        int index = n + 1;
        for(int i = 0; i < n ; i++){
            if(s.charAt(i) == s.charAt(n-i-1)){
                index = Math.min(index, i);
            }
        } 
        if(index == n+1){
            index = -1;
        }
        return index;
    }
}