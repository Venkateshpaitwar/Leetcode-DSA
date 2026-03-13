// 3296. Minimum Number of Seconds to Make Mountain Height Zero

class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 1;
        long right = (long)1e16;
        long ans = right;

        while(left <= right){
            long mid = left + (right-left) / 2;
            
            if(check(mid, mountainHeight, workerTimes)){
                ans = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return ans;
    }
    private boolean check(long time, int mountainHeight, int[] workerTimes){
        long total = 0;

        for(int wt : workerTimes){
            long x = (long)((Math.sqrt(1 + 8 * time / wt) - 1) / 2);
            total += x;

            if(total >= mountainHeight){
                return true;
            }
        }
        return total >= mountainHeight;
    }
}