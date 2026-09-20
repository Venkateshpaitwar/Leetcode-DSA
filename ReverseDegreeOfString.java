// 3498. Reverse Degree of a String

class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            ans += (i + 1) *('z' - s.charAt(i) + 1);
        }
        return ans;
    }
}