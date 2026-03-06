//1784. Check if Binary String Has at Most One Segment of Ones

class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i = 1; i < s.length()-1; i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                return false;
            }
        }
        return true;
    }
}