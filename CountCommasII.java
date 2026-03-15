class Solution {
    public long countCommas(long n) {
        long commas = 0;
        if(n <= 999){
            return 0;
        }
        for(long t = 1000; t <= n; t*=1000){
            commas += n-t+1;
        }
        return commas;
    }
}