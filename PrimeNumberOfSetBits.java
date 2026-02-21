//762. Prime Number of Set Bits in Binary Representation

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int finalAns = 0;
        while(left <= right){
            String s = Integer.toBinaryString(left);
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1'){
                    count++;
                }
            } 
            if(isPrime(count)){
                finalAns++;
            }
            left++;
        }
        return finalAns;
    }
    private static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}