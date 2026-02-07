// 1653. Minimum Deletions to Make String Balanced
class Solution {
    public int minimumDeletions(String s) {
        int countB = 0;
        int deletions = 0;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                countB++;
            } else { // c == 'a'
                deletions = Math.min(deletions + 1, countB);
            }
        }

        return deletions;
    }
}