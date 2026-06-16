// 3612. Process String with Special Operations I

class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                sb = sb.append(sb.toString());
            }else if(s.charAt(i) == '*'){
                int n = sb.length();
                if(n >= 1){
                    sb = sb.deleteCharAt(n-1);
                }
            }else if(s.charAt(i) == '%'){
                sb = sb.reverse();
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}