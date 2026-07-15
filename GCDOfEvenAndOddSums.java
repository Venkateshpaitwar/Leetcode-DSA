// 3658. GCD of Odd and Even Sums

class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 0; i <= 2 * n; i++){
            if(i % 2 == 0){
                sumEven += i;
            }else{
                sumOdd += i;
            }
        }
        return GCD(sumEven, sumOdd);
    }

    private int GCD(int sumEven, int sumOdd){
        if(sumEven == 0 || sumOdd == 0){
            return Math.max(sumEven, sumOdd);
        }
        int result = Math.min(sumEven, sumOdd);
        while(result > 0){
            if(sumEven % result == 0 && sumOdd % result == 0){
                break;
            }
            result--;
        }
        return result;
    }
}