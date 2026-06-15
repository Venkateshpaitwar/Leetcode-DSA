// 11. Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        int curr = 0;
        int prev = height.length - 1;
        int maxWater = 0;
        while(curr < prev){
            maxWater = Math.max(maxWater, Math.min(height[prev], height[curr]) * (prev - curr));
            if(height[curr] < height[prev]){
                curr++;
            }
            else{
                prev--;
            }
        }
        return maxWater;
    }
}