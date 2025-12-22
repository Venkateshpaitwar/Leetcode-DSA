// 258.Add Digits

class Solution {
    public int addDigits(int num) {
        int sum = 0;         
        if(num < 10){
            return num;
        }

        while(num != 0){
            int mod = num%10;
            sum = sum + mod;
            num = num/10;
        }
            
     
        return addDigits(sum);
    }
}