//3751. Total Waviness of Numbers in Range I

class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = num1; i < num2 + 1; i++){
            ans += waviness(i);
        }
        return ans;
    }

    private int waviness(int x){
        char[] digits = String.valueOf(x).toCharArray();
        if(digits.length < 3){
            return 0;
        }
        int count = 0;
        for(int i = 1; i < digits.length - 1; i++){
            if ((digits[i] > digits[i - 1] && digits[i] > digits[i + 1]) || (digits[i] < digits[i - 1] && digits[i] < digits[i + 1])) {
                count++;
            }
        }
        return count;
    }
}