// 2220. Minimum Bit Flips to Convert Number

class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        int flips = 0;
        while(ans != 0){
            flips += ans & 1;
            ans >>= 1;
        }
        return flips;
    }
}