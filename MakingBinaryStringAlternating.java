// 1888. Minimum Number of Flips to Make the Binary String Alternating

class Solution {
    public int minFlips(String s) {
        String doubles = s + s;
        int n = s.length();
        int bits1 = 0, bits2 = 0, left = 0;
        int ans = Integer.MAX_VALUE;
        StringBuilder zero = new StringBuilder();
        StringBuilder one = new StringBuilder();
        for(int i = 0; i < 2 * n; i++){
            if(i % 2 == 0){
                zero.append('0');
                one.append('1');
            }else{
                zero.append('1');
                one.append('0');
            }
        }
        for(int right = 0; right < 2 * n; right++){
            if(doubles.charAt(right) != zero.charAt(right)) bits1++;
            if(doubles.charAt(right) != one.charAt(right)) bits2++;
            
            if(right - left + 1 > n){
                if(doubles.charAt(left) != zero.charAt(left)) bits1--;
                if(doubles.charAt(left) != one.charAt(left)) bits2--;
                left++;
            }
            if(right - left + 1 == n){
                ans = Math.min(ans, Math.min(bits1, bits2));
            }
        }
        return ans;
    }
}