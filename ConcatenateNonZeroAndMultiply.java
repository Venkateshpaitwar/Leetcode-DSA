// 3754. Concatenate Non-Zero Digits and Multiply by Sum I

class Solution {
    public long sumAndMultiply(int n) {
        long num = 0;
        long sum = 0;
        long place = 1;

        while(n > 0){
            int digit = n % 10;
            if(digit != 0){
                num += digit * place;
                place *= 10;
                sum += digit;
            }
            n /= 10;
        }       
        return num * sum;
    }
}