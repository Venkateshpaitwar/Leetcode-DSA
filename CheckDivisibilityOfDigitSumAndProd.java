// 3622. Check Divisibility by Digit Sum and Product

class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProduct = 1;
        int d = n;
        while(n != 0){
            int n1 = n % 10;
            digitSum += n1;
            digitProduct *= n1;
            n = n / 10;
        }
        if(d % (digitSum + digitProduct) == 0){
            return true;
        }
        return false;
    }
}