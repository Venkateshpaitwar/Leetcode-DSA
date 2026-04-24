// 2833. Furthest Point From Origin

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lcount = 0;
        int rcount = 0;
        int ans = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                lcount++;
            }
            if(moves.charAt(i) == 'R'){
                rcount++;
            }
        }
        if(lcount < rcount){
            for(int i = 0; i < moves.length(); i++){
                if(moves.charAt(i) == 'L'){
                    ans--;
                }
                else {
                    ans++;
                }
            }
        }
        if(lcount >= rcount){
            for(int i = 0; i < moves.length(); i++){
                if(moves.charAt(i) == 'R'){
                    ans++;
                }
                else {
                    ans--;
                }
            }
        }
        return Math.abs(ans);
    }
}