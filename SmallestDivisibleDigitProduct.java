//3345. Smallest Divisible Digit Product I

class Solution {
    public int smallestNumber(int n, int t) {
        while(n < 101){
            if(findProduct(n) % t == 0){
                return n;
            }else{
                n++;
            }
        }
        return 0;
    }
    private int findProduct(int x){
        int prod = 1;
        if(x < 10){
            return x;
        }else{
            while(x > 0){
                int a = x % 10;
                x = x / 10;
                prod = prod * a;
            }
        }
        return prod;
    }
}