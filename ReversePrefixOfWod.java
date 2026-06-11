// 2000. Reverse Prefix of Word

class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        for (int i = 0; i <= index; i++) {
            st.push(word.charAt(i));
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.append(word.substring(index + 1));
        return sb.toString();
    }
}