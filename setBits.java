class Solution {
    public int smallestNumber(int n) {
        int numBits = Integer.toBinaryString(n).length();
        int result = (1 << numBits) -1;
        if(result < n){
            result = (1 << (numBits + 1)) -1;
        }
        return result;
    }
}