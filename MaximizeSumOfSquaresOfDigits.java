// 3723. Maximize Sum of Squares of Digits

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        if(sum > num * 9) return "";
        int rem = sum;
        for (int i = 0; i < num; i++) {
            if (rem > 9) {
                sb.append("9");
                rem -= 9;
            } else if (rem > 0) {
                sb.append(rem);
                rem = 0;
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}