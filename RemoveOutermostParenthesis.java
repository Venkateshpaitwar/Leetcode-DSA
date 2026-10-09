//1021. Remove Outermost Parentheses

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(counter > 0){
                    sb.append(s.charAt(i));
                }
                counter++;
            }
            else{
                counter--;
                if(counter > 0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}