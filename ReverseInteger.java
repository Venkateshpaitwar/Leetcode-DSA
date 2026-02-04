// 7. Reverse Integer
class Solution {
    public int reverse(int x) {
        int n = String.valueOf(Math.abs(x)).length();
        long d = (long) Math.pow(10, n - 1);  
        long ans = 0;                         
        int num = Math.abs(x);
        while(num > 0){
            int k = num % 10;
            num = num / 10;
            ans += k * d;
            d = d / 10;
        }
        if(x < 0){
            ans = -ans;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
    return (int)ans;
    }
}