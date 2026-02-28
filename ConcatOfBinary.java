// 1680. Concatenation of Consecutive Binary Numbers

class Solution {
    public int concatenatedBinary(int n) {
        long result = 0;
        int length = 0;
        int modulo = 1_000_000_007;
        for(int i = 1; i <= n; i++){
            if((i & (i-1)) == 0){
                length++;
            }
            result = ((result << length) + i) % modulo;
        }
        return (int) result;
    }
}