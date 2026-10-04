// 678. Valid Parenthesis String

class Solution {
    Boolean[][] dp;
    public boolean checkValidString(String s) {
        int n = s.length(); 
        dp = new Boolean[n + 1][n + 1]; 
        return backtrack(s, 0, 0);
    }
    private boolean backtrack(String s, int index, int open){
        if(open < 0) return false;
        if(index == s.length()) return open == 0;
        
        if(dp[index][open] != null){
            return dp[index][open];
        }
        char ch = s.charAt(index);
        boolean result;
        if(ch == '('){
            result = backtrack(s, index + 1, open + 1);
        }else if(ch == ')'){
            result =  backtrack(s, index + 1, open - 1);
        }else{
            boolean opening = backtrack(s, index + 1, open + 1);
            boolean closing = backtrack(s, index + 1, open - 1);
            boolean empty = backtrack(s, index + 1, open);
            result = opening || closing || empty;
        }
        dp[index][open] = result;
        return result;
    }
}

// class Solution {
//     public boolean checkValidString(String s) {
//         int n=s.length();
//         int min=0;
//         int max=0;
//         for(int i=0;i<n;i++){
//             if(s.charAt(i)=='('){
//                 min=min+1;
//                 max=max+1;
//             }
//             else if(s.charAt(i)==')'){
//                 min=min-1;
//                 max=max-1;
//             }
//             else{
//                 min--;
//                 max++;
//             }
//             if(min<0) min=0;
//             if(max<0) return false;
//         }
//     return (min==0);
//     }
// }