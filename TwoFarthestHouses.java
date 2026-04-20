// 2078. Two Furthest Houses With Different Colors

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = 0;
        for(int i = n - 1; i >= 0; i--){
            if(colors[i] != colors[0]){
                maxDist = Math.max(maxDist, i);
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(colors[i] != colors[n - 1]){
                maxDist = Math.max(maxDist, n - i - 1);
                break;
            }
        }
        return maxDist;
    }
}