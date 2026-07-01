// 541. Reverse String II

class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        for (int start = 0; start < chars.length; start += 2 * k) {
            int left = start;
            int right = Math.min(start + k - 1, chars.length - 1);
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}