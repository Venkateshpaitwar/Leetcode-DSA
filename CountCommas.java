// 3870. Count Commas in Range

class Solution {
    public int countCommas(int n) {
        int commas = 0;
        for(long t = 1000; t <= n; t *= 1000){
            commas += n-t+1;
        }
        return commas;
    }
}