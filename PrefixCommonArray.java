//2657. Find the Prefix Common Array of Two Arrays

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] seen = new int[n + 1];
        int[] result = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            seen[A[i]]++;
            if (seen[A[i]] == 2) {
                count++;
            }
            seen[B[i]]++;
            if (seen[B[i]] == 2) {
                count++;
            }
            result[i] = count;
        }
        return result;
    }
}