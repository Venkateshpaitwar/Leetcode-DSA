// 875. Koko Eating Bananas

class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int minSpeed = 1;
        int maxSpeed = 0;
        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }
        int ans = Integer.MAX_VALUE;

        while(minSpeed <= maxSpeed){
            int mid = (minSpeed + maxSpeed) / 2;
            long count = 0;
            for(int i = 0; i < piles.length; i++){
                count += (piles[i] + (long) mid - 1) / mid;
            }
            if(count <= h){
                ans = mid;
                maxSpeed = mid - 1;
            }else{
                minSpeed = mid + 1;
            }
        }
        return ans;
    }
}