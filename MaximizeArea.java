// 2943. Maximize Area of Square Hole in Grid
import java.util.Arrays;
class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxH = maximumConsecutive(hBars);
        int maxV = maximumConsecutive(vBars);
        int side = Math.min(maxH + 1,maxV + 1);
        int area = side * side;
        return area;
    }
    private int maximumConsecutive(int[] bars){
        int curr = 1; int max = 0;
        Arrays.sort(bars);
        for(int i = 1 ; i< bars.length; i++){
            if(bars[i] == bars[i-1] + 1){
                curr = curr + 1;
            }
            else{
                max = Math.max(curr,max);
                curr = 1;
            }   
        }
        max = Math.max(curr, max);
        return max;
    }
}