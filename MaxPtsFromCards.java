//1423. Maximum Points You Can Obtain from Cards

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;
        for(int i = 0; i < k; i++){
            lsum += cardPoints[i];
        }
        maxSum = lsum;
        int rindex = cardPoints.length - 1;
        for(int i = k -1; i >= 0; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[rindex];
            rindex--;
            maxSum = Math.max(maxSum, lsum + rsum);
        }
        return maxSum;
    }
}