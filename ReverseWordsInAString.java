// 557. Reverse Words in a String III

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString());
            result.append(" ");
        }
        
        return result.toString().trim();
    }
}