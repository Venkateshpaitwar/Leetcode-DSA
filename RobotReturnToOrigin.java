// 657. Robot Return to Origin

class Solution {
    public boolean judgeCircle(String moves) {
        int verticalSteps = 0;
        int horizontalSteps = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                horizontalSteps--;
            }else if(moves.charAt(i) == 'R'){
                horizontalSteps++;
            }else if(moves.charAt(i) == 'U'){
                verticalSteps++;
            }else if(moves.charAt(i) == 'D'){
                verticalSteps--;
            }
        }
        if(verticalSteps == 0 && horizontalSteps == 0){
            return true;
        }
        return false;
    }
}