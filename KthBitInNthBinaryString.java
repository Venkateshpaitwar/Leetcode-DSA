// 1545. Find Kth Bit in Nth Binary String
class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        for (int i = 2; i <= n; i++) {
            s = s + "1" + reverse(invert(s));
        }
        return s.charAt(k - 1); 
    }
    public String reverse(String s){
        StringBuilder reversed = new StringBuilder();
        int n = s.length();
        for(int i = n-1; i >= 0; i--){
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
    public String invert(String s){
        StringBuilder inverted = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            inverted .append(c == '0' ? '1' : '0');
        }
        return inverted.toString();
    }
}
// More optimal solution using recursion and bit manipulation
// class Solution {
//     public char findKthBit(int n, int k) {
//         return (char) ('0' + findKthBitRec(n, k));
//     }

//     private static int findKthBitRec(int n, int k) {
//         if (k == 1) {
//             return 0;
//         }

//         if ((k & (k - 1)) == 0) {
//             return 1;
//         }

//         int totalLen = 1 << n;
//         if (k * 2 < totalLen - 1) {
//             return findKthBitRec(n - 1, k);
//         } else {
//             return findKthBitRec(n - 1, totalLen - k) ^ 1;
//         }
//     }
// }