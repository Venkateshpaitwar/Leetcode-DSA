// 1927. Sum Game

class Solution {
    public boolean sumGame(String num) {
        // Alice starts first
        // Alice (not equal) -> true, Bob (equal) -> false
        int count = 0;
        int diff = 0;
        int n = num.length() / 2;
        for(int i = 0 ; i < n; i++){
            if(num.charAt(i) == '?'){
                count++;
            }else{
                diff += num.charAt(i) - '0';
            }
            if(num.charAt(i + n) == '?'){
                count--;
            }else{
                diff -= num.charAt(i + n) - '0';
            }
        }
        if(count % 2 != 0){
            return true;
        }
        return diff != -9 * (count / 2);
    }
}