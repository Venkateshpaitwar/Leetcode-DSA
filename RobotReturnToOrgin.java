//657. Robot Return to Origin

class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int left = 0; 
        int n = moves.length();
        for(int i=0; i<n; i++){
            if(moves.charAt(i) == 'U'){
                up++;
            }
            else if(moves.charAt(i) == 'D'){
                up--;
            }
            else if(moves.charAt(i) == 'L'){
                left++;
            }
            else if(moves.charAt(i) == 'R'){
                left--;
            }
        }
        if(up == 0 && left == 0){
            return true;
        }
        else{
            return false;
        }
    }
}